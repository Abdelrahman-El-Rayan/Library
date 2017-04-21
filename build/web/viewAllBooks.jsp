<%-- 
    Document   : viewAllBooks
    Created on : Dec 3, 2015, 10:20:16 PM
    Author     : CASPER
--%>

<%@page import="Model.Admin"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Book"%>


<%
Admin ad =(Admin)session.getAttribute("admin"); 
if (ad !=null){
String username =ad.getUsername(); 
String password=ad.getPassword(); 
String lev = ad.getLevel(username, password);
if (lev.equals("top")){ %>
   <%@include file="header/header.html" %> 
<form action="editBook.jsp" role="form" > 
    <%
        Book bk = new Book();
        ArrayList Books = bk.getBooks();

    %>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <tr> 
                <td>Book ID</td>
                <td>Title </td>
                <td>Edition #</td>
                <td>Page #</td>
                <td>Category</td>
                <td>Auther</td>
                <td>Publisher</td>
                <td>Availablity</td>
                <td>Edit</td>

            </tr>

            <%  for (int i = 0; i < Books.size(); i++) {
                    Book bo = new Book();
                    bo = (Book) Books.get(i);
            %>
            <tr> <td><%=  bo.getBookId()%></td>
                <td><%=  bo.getTitle()%></td>

                <td><%=  bo.getEditionNo()%></td>
                <td><%=  bo.getPageNo()%></td>


                <% int catid = bo.getCategoryId();
                    String category = bo.getNames("category", catid);%>
                <td><%=  category%></td>

                <% int autherid = bo.getAutherId();
                 String autherName = bo.getNames("auther", autherid);%>
                <td><%= autherName%></td>

                <% int pubid = bo.getPublisherId();
                 String pubName = bo.getNames("publisher", pubid);%>

                <td><%=  pubName%></td>
                <% int avail = bo.getAvailability();
                    String availability;
                    if (avail == 0) {%>
                     <td>Available </td>
                        <td> <input type="submit" name="<%= bo.getBookId()%>" class="btn btn-info" value="Edit">
                    <%} else {%>
                        
                        <td> Not Available</td>
                        <td>  Can not Edit</td>
                   <% }
                %>
                
                
            </tr>
            <% }%>

        </table>
    </div>
</form>
         <%} else { %>
<%@include file="header/lowadmin.html" %>   

<form action="editBook.jsp" role="form" > 
    <%
        Book bk = new Book();
        ArrayList Books = bk.getBooks();

    %>
    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <tr> 
                <td>Book ID</td>
                <td>Title </td>
                <td>Edition #</td>
                <td>Page #</td>
                <td>Category</td>
                <td>Auther</td>
                <td>Publisher</td>
                <td>Availablity</td>
                <td>Edit</td>

            </tr>

            <%  for (int i = 0; i < Books.size(); i++) {
                    Book bo = new Book();
                    bo = (Book) Books.get(i);
            %>
            <tr> <td><%=  bo.getBookId()%></td>
                <td><%=  bo.getTitle()%></td>

                <td><%=  bo.getEditionNo()%></td>
                <td><%=  bo.getPageNo()%></td>


                <% int catid = bo.getCategoryId();
                    String category = bo.getNames("category", catid);%>
                <td><%=  category%></td>

                <% int autherid = bo.getAutherId();
                 String autherName = bo.getNames("auther", autherid);%>
                <td><%= autherName%></td>

                <% int pubid = bo.getPublisherId();
                 String pubName = bo.getNames("publisher", pubid);%>

                <td><%=  pubName%></td>
                <% int avail = bo.getAvailability();
                    String availability;
                    if (avail == 0) {%>
                     <td>Available </td>
                        <td> <input type="submit" name="<%= bo.getBookId()%>" class="btn btn-info" value="Edit">
                    <%} else {%>
                        
                        <td> Not Available</td>
                        <td>  Can not Edit</td>
                   <% }
                %>
                
                
            </tr>
            <% }%>

        </table>
    </div>
</form>

<% }  } %>
<%@include file="footer/footer.html" %>
