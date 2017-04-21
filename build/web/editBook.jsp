
<%@page import="Model.Admin"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Book"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header/header.html" %>




<%

    Enumeration e = request.getParameterNames();
    String boId = (String) e.nextElement();
    int bookId = Integer.parseInt(boId);
    Book b = new Book();   
    Book bk = b.getBookInfo(bookId);
    Admin ad =new Admin();
%>
<div class="row">
    <div class="col-md-12"> 
        
        
        
        <form  action="editBook" role="form" name="borform" >
            <div class="form-group col-xs-8">
                <label for="bbokid">Book ID</label>
                <input type="text" class="form-control" name="bookId" value="<%= bk.getBookId() %>" readonly>
            </div>

            <div class="form-group col-xs-8">
                <label for="BookTitle">Book Title</label>
                <input type="text" name="title" class="form-control input-lg" value="<%= bk.getTitle()%>" >
            </div>
            
            <div class="form-group col-xs-8">
                <label for="pageNumber"> Page # </label>
                <input type="text" name="pgno"  class="form-control input-lg" value="<%= bk.getPageNo()  %>" >
            </div>
            <div class="form-group col-xs-8">
                <label for="pageNumber"> Edtion Number </label>
                <input type="text" name="edition"  class="form-control input-lg" value="<%= bk.getEditionNo() %>" >
            </div>
              
            

            <div class="form-group col-xs-8">
                  <label for="authername">Auther Name</label>
                  <select name="authername" class="form-control input-lg">
                   <%  int id = bk.getAutherId() ;
                       String authername = bk.getNames("auther", id);
                   %>
                   <%-- get auther of the currnet book  from auther table using autherid  --%>
                   <option value="<%= authername  %>"> <%= authername  %> </option>
                   
                   <%-- get all names from auther table using get name method  --%>
                 <% ArrayList autherName = ad.getName("auther"); 
                for (int i =0 ; i<autherName.size();i++){
                %>
                
                <option value="<%= autherName.get(i)%>"> <%= autherName.get(i) %></option> 
                <% }%>
            </select>
            </div>
              
            <div class="form-group col-xs-8">
                  <label for="category">Category Name</label>
                  <select name="catname" class="form-control input-lg"> 
                    <%  int catid = bk.getCategoryId();
                       String catname = bk.getNames("category", catid);
                   %>
                   <%-- get catogry of the currnet table  from auther table using autherid  --%>
                   <option value="<%= catname %>"> <%= catname %> </option>
                <% 
                ArrayList catName = ad.getName("category"); 
                for (int i =0 ; i<catName.size();i++){
                %>
                
                <option value="<%= catName.get(i)%>"> <%= catName.get(i) %></option> 
                <% }%>
            </select>
            </div>
            
            <div class="form-group col-xs-8">
                  <label for="publish">Publisher Name</label>
                  <select name="publisher" class="form-control input-lg"> 
                     <%  int pubid = bk.getPublisherId();
                       String pubname = bk.getNames("publisher", pubid);
                   %>
                   <%-- get catogry of the currnet table  from auther table using autherid  --%>
                   <option value="<%= pubname %>"> <%= pubname %> </option>
                <% 
                ArrayList pubName = ad.getName("publisher"); 
                for (int i =0 ; i<pubName.size();i++){
                %>
                
                <option value="<%= pubName.get(i)%>"> <%= pubName.get(i) %></option> 
                <% }%>
            </select>
            </div>
            
            <div class="form-group col-xs-8">
                  <label for="avail">Availability</label>
                  <select name="avail" class="form-control input-lg"> 
                  <% int avail =bk.getAvailability() ;
                    if (avail == 0){
                  %>
                <option value="0">Available</option> 
                <option value="1">Not Available</option> 
               <% }else { %>
                  <option value="1">Not Available</option> 
               <option value="0">Available</option> 
             
               <% } %>
            </select>
            </div>
            <div class="form-group col-xs-8 ">
                <input type="submit" value="update" class="btn btn-primary" > 
            </div>

        </form>
    </div>
</div>
<%@include  file="footer/footer.html" %>