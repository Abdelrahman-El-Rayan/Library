<%-- 
    Document   : bookslist
    Created on : Dec 4, 2015, 4:16:38 PM
    Author     : CASPER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header/userheader.html" %>


<%
     Book bo = new Book();
   
    ArrayList Books = bo.getBooks();
   if (Books != null ){
       
   
%>

<form action="borrowform.jsp" >


    <div class="table-responsive">
        <table class="table table-hover table-striped">
            <tr> 

                <td>Title </td>
                <td>Edition #</td>
                <td>Page #</td>
                <td>Category</td>
                <td>Auther</td>
                <td>Publisher</td>
                <td>Availablity</td>


            </tr>
            <%
                for (int i = 0; i <Books.size(); i++) {
                    bo = (Book)Books.get(i);
            %>
            <tr>

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

                <td><%= pubName %></td>
               <% int avail = bo.getAvailability();
                    if (avail == 0) {%> 
                <td> <input type="submit" class="btn btn-primary" name="<%= bo.getBookId()%>" value="Borrow"></td>
                    <% } else { %>
                <td>Un available </td>
                <% } %>
               


            </tr>          

            <% } %>
        </table>
    </div>
</form>

<% }else { %> 
<h2> There is no books               </h2>
<%} %> 
<%@include file="footer/footer.html" %>