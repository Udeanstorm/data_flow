<!--
/*
* @Copyright (c) 2018 缪聪(mcg-helper@qq.com)
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script language="JavaScript">
    var valueIndex = -1;
    $(document).ready(function () {
        var value = $("#${modalId }_name").val();
        if(value != "" || value != undefined){
            var listIndex = 6;
            while(listIndex < nodeList.length){
                if(value == nodeList[listIndex]){
                    value = listIndex;
                    break;
                }
                listIndex++;
            }
        }
    })

    function getNodeId() {
        var value = $("#${modalId }_name").val();
        if(valueIndex == -1) {
            nodeList.push(value);
        }else{
            nodeList[valueIndex] = value;
        }
        return $("#id").attr("name");
    }
</script>
<div id = "id" name="${modalId}" style="display: none"></div>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <ul class="nav nav-tabs" role="tablist">
                <li role="presentation" class="active"><a href="#${modalId }_textProperty" data-toggle="tab">属性</a></li>
                <li role="presentation"><a href="#${modalId }_textCore" data-toggle="tab">源代码</a></li>
                <li role="presentation"><a href="#${modalId }_explain" data-toggle="tab">说明</a></li>
            </ul>
        </div>
    </div>

    <div class="row margin_top">
        <div class="col-md-12">
            <form id="${modalId }_textForm" class="form-horizontal" role="form">
                <div class="form-body">
                    <div id="myTabContent" class="tab-content">
                        <div class="tab-pane fade in active" id="${modalId }_textProperty">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">struct名称</label>
                                <div class="col-sm-4">
                                    <div class="fg-line">
                                        <input type="text" id="${modalId }_name" name="nodeProperty[name]"
                                               class="form-control"/>
                                    </div>
                                </div>

<%--                                <label class="col-sm-1 control-label">控件key</label>--%>
<%--                                <div class="col-sm-4">--%>
<%--                                    <div class="fg-line">--%>
<%--                                        <input type="text" id="${modalId }_key" name="textProperty[key]"--%>
<%--                                               class="form-control"/>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
                            </div>
<%--                            <div class="form-group">--%>
<%--                                <label class="col-sm-2 control-label">文件名称</label>--%>
<%--                                <div class="fg-line col-sm-4">--%>
<%--                                    <input type="hidden" id="${modalId }_textId" name="textId" value="${modalId }"/>--%>
<%--                                    <input type="text" id="${modalId }_fileName" name="textProperty[fileName]"--%>
<%--                                           class="form-control" disabled="true" value = "don't need edit"/>--%>
<%--                                </div>--%>
<%--                            </div>--%>
                        </div>
                        <div class="tab-pane fade" id="${modalId }_textCore">
                            <div class="form-group">
                                <div class="col-sm-12">
                                    <pre id="${modalId }_editor" style="min-height:300px"></pre>
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="${modalId }_explain">
                            <div class="form-group">
                                <div class="col-sm-12">
                                    <div class="fg-line">
                                        struct node, edit struct, class, or function here.
                                        Only one struct or class you are supported to edit if you want to use it!!!
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>	