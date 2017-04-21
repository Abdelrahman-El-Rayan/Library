
<%@page import="Model.Member"%>
<%-- 
    Document   : viewborrowedbooks
    Created on : Dec 4, 2015, 9:47:39 PM
    Author     : CASPER
--%>

<%@page import="Model.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header/userheader.html" %>
<div class="row">
    <div class="col-md-12">    
        
        
<%
    Member m=(Member) session.getAttribute("member");
     if (m !=null) {
         
     
    String member=m.getUsername();
    Book bk = new Book();
    ArrayList Books = bk.getUserBooks(member);
    if (Books != null ){

%>




        <form  action="extendForm.jsp" role="form" >
            <div class="table-responsive">
                <table class="table table-hover table-striped">
                    <tr> 

                        <td>Title </td>
                        <td>start Date</td>
                        <td>Return Date</td>
                        <td>Extend</td>
                     



                    </tr>
                    <% 
                     
                         
                     
                   for (int i = 0; i < Books.size(); i++) {
                            Book bo = new Book();
                            bo = (Book) Books.get(i);
                    %>
                    <tr>
                        <% int bookId = bo.getBookId();
                            String title = bo.getBookTitle(bookId);
                        %>
                        <td><%= title%></td>

                        <td><%=  bo.getStartDate()%></td>
                        <td><%=  bo.getReturnDate()%></td>
                         <td> <input type="submit" class="btn btn-success" name="<%=bo.getBookId()%>" value="Extend"></td> 
                         

                        <% }     %>
                   
                  
                </table>
            </div>

        </form>
            <% } else {%>
            <h2>There is no books to extend </h2>
        <%}%>          
    </div> 
</div>
        <% } else {  %>
        <h2> Please Login Again  </h2>
<%}%>
<%@include file="footer/footer.html" %>
