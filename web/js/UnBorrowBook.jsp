<%-- 
    Document   : UnBorrowBook
    Created on : Dec 21, 2015, 1:26:39 AM
    Author     : CASPER
--%>

<%@page import="Model.Book"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header/userheader.html" %>
       
         <%
    Enumeration e=request.getParameterNames();
    String boId= (String)e.nextElement() ;
    int bookId =Integer.parseInt(boId);
    Book  b =new Book();
    String title = b.getBookTitle(bookId);
    %>
    <div class="row">
    <div class="col-md-12">    
        
       <form  action="UbBorrow" role="form" >
            <div class="form-group col-xs-8">
                <label for="booktitle">Book Title</label>
                <input type="text" class="form-control" name="title" value="<%= title %>" readonly>
            </div>

            <div class="form-group col-xs-8">
                <label for="sdate">Starting Date</label>
                <input type="date" name="from" class="form-control input-lg" >
            </div>
            <div class="form-group col-xs-8">
                <label for="rdate">Return Date </label>
                <input type="date" name="to"  class="form-control input-lg" >
            </div>
            
            
            <div class="form-group col-xs-8 ">
                <input type="submit" value="UnBorrow" class="btn btn-primary"> 
            </div>
           
    </form>
    </div>
    </div>
   <%@include  file="footer/footer.html" %>