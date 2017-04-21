<%-- 
    Document   : searchResult
    Created on : Dec 5, 2015, 2:44:02 AM
    Author     : CASPER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header/userheader.html" %>


<%
    Book b = new Book();

    String searchword =request.getParameter("search");
    String criteria  = request.getParameter("criteria");

   ArrayList Books =  b.searchBook(searchword, criteria);
   

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

        </tr>
        <%             for (int i = 0; i < Books.size(); i++) {
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
                if (avail == 0) {
                    availability = "available";
                } else {
                    availability = "Not Available";
                }
            %>
            <td><%=  availability%></td>

        </tr>
        <% }%>
    </table>
</div> 
<%@include  file="footer/footer.html" %>