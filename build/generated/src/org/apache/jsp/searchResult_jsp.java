package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.Book;

public final class searchResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header/userheader.html");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/plugins/morris.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
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
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Top Menu Items -->\r\n");
      out.write("                <ul class=\"nav navbar-right top-nav\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"logOut.jsp\"><i class=\"fa fa-fw fa-power-off\"></i> Log Out</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav side-nav\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li >\r\n");
      out.write("                            <a href=\"bookslist.jsp\" > view All Books </a>\r\n");
      out.write("                           \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"editprofile.jsp\"> Edit profile </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"viewborrowedbooks.jsp\"> view Borrowed Books</a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                          <li>\r\n");
      out.write("                            <a href=\"extend.jsp\"> Extend Period </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("\r\n");
      out.write("                            <a href=\"search.jsp\"> Search </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-collapse -->\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"page-wrapper\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

        Book b =new Book();
        
        String searchword=request.getParameter("search");
        String criteria=request.getParameter("criteria");
        
        b.searchBook(searchword,criteria);
        ArrayList Books= b.getBooks();
       
     
      out.write("\n");
      out.write("     <div class=\"table-responsive\">\n");
      out.write("      <table class=\"table table-hover table-striped\">\n");
      out.write(" \n");
      out.write("         <tr> \n");
      out.write("             \n");
      out.write("             <td>Book ID</td>\n");
      out.write("             <td>Title </td>\n");
      out.write("             <td>Edition #</td>\n");
      out.write("             <td>Page #</td>\n");
      out.write("             <td>Category</td>\n");
      out.write("             <td>Auther</td>\n");
      out.write("             <td>Publisher</td>\n");
      out.write("             <td>Availablity</td>\n");
      out.write("             \n");
      out.write("         </tr>\n");
      out.write("         ");
  
        
        for (int i =0 ; i<Books.size(); i++) {
           Book bo =new Book() ;
           bo =(Book)Books.get(i);
         
      out.write("\n");
      out.write("         <tr> <td>");
      out.print(  bo.getBookId());
      out.write("</td>\n");
      out.write("             <td>");
      out.print(  bo.getTitle() );
      out.write("</td>      \n");
      out.write("             <td>");
      out.print(  bo.getEditionNo() );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(  bo.getPageNo());
      out.write("</td>\n");
      out.write("       \n");
      out.write("             \n");
      out.write("                ");
 int catid =bo.getCategoryId();
                       String category = bo.getNames("category", catid);  
      out.write("\n");
      out.write("             <td>");
      out.print(  category );
      out.write("</td>\n");
      out.write("             \n");
      out.write("             ");
 int autherid =bo.getAutherId();
                       String autherName = bo.getNames("auther",autherid);  
      out.write("\n");
      out.write("             <td>");
      out.print( autherName );
      out.write("</td>\n");
      out.write("             \n");
      out.write("             ");
 int pubid =bo.getPublisherId();
                       String pubName = bo.getNames("publisher", pubid);  
      out.write("\n");
      out.write("          \n");
      out.write("                       <td>");
      out.print(  pubName );
      out.write("</td>\n");
      out.write("             ");
 int avail =bo.getAvailability();
               String availability;
               if (avail==0){
                   availability="available";
               }else {
                   availability="Not Available";
               }
                       
      out.write("\n");
      out.write("             <td>");
      out.print(  availability );
      out.write("</td>\n");
      out.write("             \n");
      out.write("         </tr>\n");
      out.write("       ");
 } 
      out.write("\n");
      out.write("     </table>\n");
      out.write("     </div> \n");
      out.write("    ");
      out.write("                     </div >\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /#page-wrapper -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("            <!-- jQuery -->\r\n");
      out.write("            <script src=\"js/jquery.js\" type=\"text/javascript\" ></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("            <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Morris Charts JavaScript -->\r\n");
      out.write("            <script src=\"js/plugins/morris/raphael.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("            <script src=\"js/plugins/morris/morris.min.js\"type=\"text/javascript\" ></script>\r\n");
      out.write("            <script src=\"js/plugins/morris/morris-data.js\" type=\"text/javascript\"></script>\r\n");
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
