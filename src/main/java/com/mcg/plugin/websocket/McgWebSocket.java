/*
 * @Copyright (c) 2018 缪聪(mcg-helper@qq.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");  
 * you may not use this file except in compliance with the License.  
 * You may obtain a copy of the License at  
 *     
 *     http://www.apache.org/licenses/LICENSE-2.0  
 *     
 * Unless required by applicable law or agreed to in writing, software  
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 * See the License for the specific language governing permissions and  
 * limitations under the License.
 */

package com.mcg.plugin.websocket;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mcg.entity.auth.PermissionCollection;
import com.mcg.entity.auth.UserCacheBean;


@ServerEndpoint(value = "/message", configurator = GetHttpSessionConfigurator.class)
public class McgWebSocket {
	
	private static Logger logger = LoggerFactory.getLogger(McgWebSocket.class);
	
    @OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {

    	logger.debug("接收数据：{}, sessionId:{}", message, session.getId());
        if (session.isOpen()) {
            session.getBasicRemote().sendText(message, true);
        }

    }

    @OnOpen
    public void onOpen(Session session, EndpointConfig config) {
    	HttpSession httpSession = (HttpSession) config.getUserProperties()
    	           .get(HttpSession.class.getName());
    	UserCacheBean ucb = PermissionCollection.getInstance().getUserCache(httpSession.getId());
    	if(ucb != null && ucb.getUser() != null) {
    		ucb.getUser().setSession(session);
    	}
    }

    @OnClose
    public void onClose() {
    	logger.debug("关闭一个websocket通道成功");
    }
    
    @OnError 
    public void onerror(Session session, Throwable throwable) { 
    	logger.error("非法关闭一个websocket通道成功", throwable);
    }
}