/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2019-12-23 06:58:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Connetor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        var cid = $(\"#id\").attr(\"name\").substr(0,18) + $(\"#id \").attr(\"name\").substr(36,18);\r\n");
      out.write("        var id = $(\"#id\").attr(\"name\").substr(0,18);\r\n");
      out.write("        var cons = OutputMap.get(id);\r\n");
      out.write("        if(cons != undefined && cons.nList.length != 0){\r\n");
      out.write("            var checked = InputMap.get(cid);\r\n");
      out.write("            var nList = cons.getName();\r\n");
      out.write("            var tList = cons.getType();\r\n");
      out.write("            if(checked == undefined) {\r\n");
      out.write("                for (var i = 0; i < nList.length; i++) {\r\n");
      out.write("                    var selector = tList[i] + \"_\" + nList[i];\r\n");
      out.write("                    var divNode = \"<input type = 'checkbox' name = 'input' checked = 'checked' value='\"+ selector+\"'> \" + selector + \"<br>\";\r\n");
      out.write("                    $(\"#selectForm\").append(divNode);\r\n");
      out.write("                }\r\n");
      out.write("            }else{\r\n");
      out.write("                for (var i = 0; i < nList.length; i++) {\r\n");
      out.write("                    var selector = tList[i] + \"_\" + nList[i];\r\n");
      out.write("                    if(checked.indexOf(selector) != -1) {\r\n");
      out.write("                        var divNode = \"<input type = 'checkbox' name = 'input' checked = 'checked' value='\"+ selector+\"'> \" + selector + \"<br>\";\r\n");
      out.write("                    }else{\r\n");
      out.write("                        var divNode =  \"<input type = 'checkbox' name = 'input' value='\"+ selector+\"'> \" + selector + \"<br>\";\r\n");
      out.write("                    }\r\n");
      out.write("                    $(\"#selectForm\").append(divNode);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        $(\"#save\").bind(\"click\",function () {\r\n");
      out.write("            checked = [];\r\n");
      out.write("            var connectorLabel = \"\";\r\n");
      out.write("            $(\"input[name = 'input']:checked\").each(function () {\r\n");
      out.write("                checked.push($(this).val());\r\n");
      out.write("                connectorLabel += $(this).val()+\",\";\r\n");
      out.write("            });\r\n");
      out.write("            if(connectorLabel != \"\"){\r\n");
      out.write("                connectorLabel = connectorLabel.substr(0,connectorLabel.length-1);\r\n");
      out.write("            }\r\n");
      out.write("            setLabel($(\"#id\").attr(\"name\"),connectorLabel);\r\n");
      out.write("            InputMap.put(cid, checked);\r\n");
      out.write("            acquireInput(cid, checked);\r\n");
      out.write("        })\r\n");
      out.write("        }\r\n");
      out.write("    );\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<div id = \"id\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modalId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"display: none\"></div>\r\n");
      out.write("<div class=\"container-fluid\" >\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("                <li role=\"presentation\" class=\"active\"><a href=\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modalId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("_textProperty\" data-toggle=\"tab\">输入</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row margin_top\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <form id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modalId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("_textForm\" class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                <div class=\"form-body\">\r\n");
      out.write("                    <div id=\"myTabContent\" class=\"tab-content\">\r\n");
      out.write("                        <div class=\"tab-pane fade in active\" id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modalId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("_textProperty\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"col-sm-2 control-label\">控件名称</label>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"fg-line\">\r\n");
      out.write("                                        <input type=\"text\" id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modalId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("_name\"  class=\"form-control\"  />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <label class=\"col-sm-1 control-label\">控件key</label>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                    <div class=\"fg-line\">\r\n");
      out.write("                                        <input type=\"text\" id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modalId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("_key\"  class=\"form-control\"  />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label name = \"dataType\" class=\"col-sm-2 control-label\" style=\"text-align: center\">data type</label>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <label name = \"dataName\" class=\"col-sm-2 control-label\" style=\"text-align: center\">data name</label>\r\n");
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
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id =\"selectDiv\">\r\n");
      out.write("        <form id = \"selectForm\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <button id = \"save\">save</button>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
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
