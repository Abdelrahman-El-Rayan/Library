package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header/index.html");
    _jspx_dependants.add("/footer/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>SB Admin - Bootstrap Admin Template</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Navigation -->\r\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">Library System </a>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"page-wrapper\">\r\n");
      out.write("                  <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                  ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        \n");
      out.write("         <a href=\"adminlogin.jsp\" >\n");
      out.write("             <img src=\"images/user.png\" class=\"img-responsive img-circle \" width=\"40%\" height=\"200px\"/> \n");
      out.write("             Admin</a>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6\"> \n");
      out.write("        \n");
      out.write("        <a href=\"userlogin.jsp\"> \n");
      out.write("            <img src=\"images/user-group-icon.png\" class=\"img-responsive img-circle \" width=\"40%\" height=\"200px\"/>\n");
      out.write("            User</a>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");
      out.write("                     </div >\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /#page-wrapper -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("            <!-- jQuery -->\r\n");
      out.write("            <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Morris Charts JavaScript -->\r\n");
      out.write("            <script src=\"js/plugins/morris/raphael.min.js\"></script>\r\n");
      out.write("            <script src=\"js/plugins/morris/morris.min.js\"></script>\r\n");
      out.write("            <script src=\"js/plugins/morris/morris-data.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
