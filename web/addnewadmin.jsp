


<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page   import="Model.Admin" %>


<%
Admin ad =(Admin)session.getAttribute("admin"); 
if (ad !=null){
String username =ad.getUsername(); 
String password=ad.getPassword(); 
String lev = ad.getLevel(username, password);
if (lev.equals("top")){ %>
   <%@include file="header/header.html" %> 

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Adding new Admin 
        </h1>
        
    </div>
</div>
<div class="row">
    <div class="col-md-12">    
        <form action="AddAdmin" role="form" >
            <div class="form-group col-xs-8">
                <label for="usr">Name:</label>
                <input type="text" class="form-control" name="name">
            </div>

            <div class="form-group col-xs-8">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control input-lg" name="password">
            </div>
             <div class="form-group col-xs-8">
                <label for="pwd">Confirm Password:</label>
                <input type="password" class="form-control input-lg" name="conpassword">
            </div>

            <div class="form-group col-xs-8">
                  <label for="level">Level</label>
                  <select class="form-control input-lg">
                        <option value="top">top</option>
                        <option value="low">low</option>
                   </select>
            </div>
            <br> 
            <br>
             <div class="form-group col-xs-8">
                  <input type="submit" value="Add" class="btn btn-primary"/>
            </div>
           
        </form>

    </div> 
</div>
<%} else { %>
<%@include file="header/lowadmin.html" %>      
<% }  } %>
<%@include file="footer/footer.html" %>