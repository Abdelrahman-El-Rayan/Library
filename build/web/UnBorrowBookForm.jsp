
<%@page import="Model.Member"%>
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
        
       <form  action="UnBorrow" role="form" >
            <div class="form-group col-xs-8">
                <label for="booktitle">Book Title</label>
                <input type="text" class="form-control" name="title" value="<%= title %>" readonly>
            </div>

  
            
            
            <div class="form-group col-xs-8 ">
                <input type="submit" value="Return" class="btn btn-danger"> 
            </div>
           
    </form>
    </div>
    </div>
    </body>
</html>

