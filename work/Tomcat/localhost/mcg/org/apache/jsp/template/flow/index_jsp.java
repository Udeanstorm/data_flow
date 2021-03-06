/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2019-12-23 01:54:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template.flow;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- \r\n");
      out.write("/*\r\n");
      out.write(" * @Copyright (c) 2018 缪聪(mcg-helper@qq.com)\r\n");
      out.write(" * \r\n");
      out.write(" * Licensed under the Apache License, Version 2.0 (the \"License\");  \r\n");
      out.write(" * you may not use this file except in compliance with the License.  \r\n");
      out.write(" * You may obtain a copy of the License at  \r\n");
      out.write(" *     \r\n");
      out.write(" *     http://www.apache.org/licenses/LICENSE-2.0  \r\n");
      out.write(" *     \r\n");
      out.write(" * Unless required by applicable law or agreed to in writing, software  \r\n");
      out.write(" * distributed under the License is distributed on an \"AS IS\" BASIS,  \r\n");
      out.write(" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  \r\n");
      out.write(" * See the License for the specific language governing permissions and  \r\n");
      out.write(" * limitations under the License.\r\n");
      out.write(" */\r\n");
      out.write(" -->\r\n");
      out.write(" \r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" type=\"image/png\" href=\"../../img/favicon.png\">\r\n");
      out.write("        <title>mcg-helper研发助手</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/library/js/flow/mcgfn.js?_v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.print(basePath );
      out.write("/library/js/flow/addition.js?_v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- 主面body开始 -->\r\n");
      out.write("\t\t<div id=\"mcg_body\" class=\"container-fluid autoHeight\">\r\n");
      out.write("\t\t\t<div class=\"row autoHeight\">\r\n");
      out.write("\t\t\t\t<!-- 工具区开始 -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2 autoHeight\">\r\n");
      out.write("\t\t\t\t\t<div id=\"mcg_toolbar\" class=\"row autoHeight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"#collapseOne\" aria-expanded=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-controls=\"collapseOne\">拖拽控件</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"collapseOne\" class=\"panel-collapse collapse in\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trole=\"tabpanel\" aria-labelledby=\"headingOne\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarStart\" class=\"toolbar_eletype\" eletype=\"start\">开始</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarEnd\" class=\"toolbar_eletype\" eletype=\"end\">结束</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarJson\" class=\"toolbar_eletype\" eletype=\"json\">json</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarData\" class=\"toolbar_eletype\" eletype=\"data\">data</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarText\" class=\"toolbar_eletype\" eletype=\"text\">文本</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarSqlQuery\" class=\"toolbar_eletype\" eletype=\"sqlQuery\">sql查询</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarSqlExecute\" class=\"toolbar_eletype\" eletype=\"sqlExecute\">sql执行</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarScript\" class=\"toolbar_eletype\" eletype=\"script\">JS脚本</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarJava\" class=\"toolbar_eletype\" eletype=\"java\">JAVA</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarPython\" class=\"toolbar_eletype\" eletype=\"python\">Python</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarLinux\" class=\"toolbar_eletype\" eletype=\"linux\">Linux</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarWonton\" class=\"toolbar_eletype\" eletype=\"wonton\">混沌</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarProcess\" class=\"toolbar_eletype\" eletype=\"process\">子流程</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarLoop\" class=\"toolbar_eletype\" eletype=\"loop\">循环</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                            <div class=\"panel panel-default\">\r\n");
      out.write("                                <div class=\"panel-heading\" role=\"tab\" id=\"headingOne2\">\r\n");
      out.write("                                    <h4 class=\"panel-title\">\r\n");
      out.write("                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\"\r\n");
      out.write("                                           href=\"#collapseOne\" aria-expanded=\"true\"\r\n");
      out.write("                                           aria-controls=\"collapseOne\">可用控件</a>\r\n");
      out.write("                                    </h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"collapseOne2\" class=\"panel-collapse collapse in\"\r\n");
      out.write("                                     role=\"tabpanel\" aria-labelledby=\"headingOne\">\r\n");
      out.write("                                    <div class=\"panel-body\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("                                                <div id=\"toolbarText2\" class=\"toolbar_eletype\" eletype=\"text\">文本</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"toolbarInfo\" class=\"toolbar_eletype\" eletype=\"info\">信息</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 工具区结束 -->\r\n");
      out.write("\t\t\t\t<!-- 流程工作区开始 -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-10 autoHeight\" style=\"border-left: 1px solid #e5e5e5;\">\r\n");
      out.write("\t\t\t\t\t<!-- 功能按钮操作区开始 -->\r\n");
      out.write("\t\t\t\t\t<div id=\"mcg_func\" class=\"row\">\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group no_width_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"flowSelect\" value=\"\" flowId=\"\" flowName=\"\" flowPid=\"\" class=\"btn btn-default\" type=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t   我的流程&nbsp;<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul id=\"flowTree\" class=\"ztree\" style=\"min-width: 240px;\"></ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"flowClearBtn\" type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-remove-sign\"></span>&nbsp;清空</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"flowDataSourceBtn\" type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-copyright-mark\"></span>&nbsp;数据源</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"flowSaveBtn\" type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-floppy-saved\"></span>&nbsp;保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"flowGenBtn\" type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-registration-mark\"></span>&nbsp;执行</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"flowImpBtn\" type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-upload\"></span>&nbsp;导入</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"flowExpBtn\" type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-download\"></span>&nbsp;导出</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 功能按钮操作区结束 -->\r\n");
      out.write("\t\t\t\t\t<!-- 绘制流程区开始 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"row autoHeight\">\r\n");
      out.write("\t\t    \t\t\t<div class=\"demo flowarea autoHeight\" id=\"flowarea\" style=\"overflow:scroll;\"></div>\r\n");
      out.write("\t\t    \t\t</div>\r\n");
      out.write("\t\t    \t\t<!-- 绘制流程区结束 -->\r\n");
      out.write("\t\t    \t\t<!-- 控制台区开始 -->\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t    \t\t\r\n");
      out.write("\t\t    \t\t<!-- 控制台区结束 -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 流程工作区结束 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 主面body结束 -->\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
