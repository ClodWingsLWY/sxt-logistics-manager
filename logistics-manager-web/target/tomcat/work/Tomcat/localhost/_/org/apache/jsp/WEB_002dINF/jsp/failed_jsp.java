/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-23 02:31:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class failed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<title>无标题文档</title>\r\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("\t\t<script language=\"javascript\">\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t$('.error').css({\r\n");
      out.write("\t\t\t\t\t'position' : 'absolute',\r\n");
      out.write("\t\t\t\t\t'left' : ($(window).width() - 490) / 2\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(window).resize(function() {\r\n");
      out.write("\t\t\t\t\t$('.error').css({\r\n");
      out.write("\t\t\t\t\t\t'position' : 'absolute',\r\n");
      out.write("\t\t\t\t\t\t'left' : ($(window).width() - 490) / 2\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body style=\"background: #edf6fa;\">\r\n");
      out.write("\t\t<div class=\"place\">\r\n");
      out.write("\t\t\t<span>位置：</span>\r\n");
      out.write("\t\t\t<ul class=\"placeul\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">没有访问权限提示</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"error\">\r\n");
      out.write("\t\t\t<h2>非常遗憾，您没有权限访问该页面！</h2>\r\n");
      out.write("\t\t\t<p>看到这个提示，就自认倒霉吧!</p>\r\n");
      out.write("\t\t\t<div class=\"reindex\">\r\n");
      out.write("\t\t\t\t<a href=\"/main\" target=\"_parent\">返回首页</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"display: none\">\r\n");
      out.write("\t\t\t<script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540'\r\n");
      out.write("\t\t\t\tlanguage='JavaScript' charset='gb2312'></script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
