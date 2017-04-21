package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title> Admin Template</title>\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("           \n");
      out.write("                    function validate()\n");
      out.write("                    {\n");
      out.write("                        var password = document.forms[\"sign\"][\"password\"].value;\n");
      out.write("                        var conpassword = document.forms[\"sign\"][\"conpassword\"].value;\n");
      out.write("                        var gender = document.forms[\"sign\"][\"gender\"].value;\n");
      out.write("                        \n");
      out.write("                         if (password != conpassword)\n");
      out.write("                        {\n");
      out.write("                            alert(\"password must be matches\");\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                        else if (gender=null || gender==\"\")\n");
      out.write("                        {\n");
      out.write("                            alert(\"choose gender\");\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                       \n");
      out.write("                        else{\n");
      out.write("                            alert(\"done\");\n");
      out.write("                    }   return true;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"cen\">\n");
      out.write("                        <form action=\"Signup\" method=\"POST\"  role=\"form\" name=\"sign\" onsubmit=\"return validate()\" >\n");
      out.write("                            <h2>Sign up</h2>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-xs-8 \">\n");
      out.write("                                <label for=\"username \">username </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\" required >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-xs-8\">\n");
      out.write("                                <label for=\"password \">password </label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" required >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-xs-8\">\n");
      out.write("                                <label for=\"conpwd \">confirm password </label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"conpassword\" required >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- validate -->\n");
      out.write("                            <div class=\"form-group col-xs-8\">\n");
      out.write("                                <label for=\"gender \">Gender</label>\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"male\" /> Male\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"female\" >female\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-xs-8\">\n");
      out.write("                                <label for=\"phone\">phone </label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"phone\" required >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group col-xs-8\">\n");
      out.write("                                <label for=\"address\">Address</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"address\" required >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-xs-8\">\n");
      out.write("                                <label for=\"email\">Email</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\" required >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-xs-8\">\n");
      out.write("                                <input type=\"submit\" value=\"Sign up\" class=\"btn btn-primary\"/>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Morris Charts JavaScript -->\n");
      out.write("        <script src=\"js/plugins/morris/raphael.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/morris.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/morris/morris-data.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
