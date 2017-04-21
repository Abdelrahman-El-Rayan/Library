<%-- 
    Document   : addnewauther
    Created on : Dec 4, 2015, 1:32:28 AM
    Author     : CASPER
--%>

<%@page import="Model.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
            <center>  Adding new Auther </center> 
        </h1>

    </div>
</div>
<div class="row">
    <div class="col-md-12">    
        <form action="AddAuther" role="form" >
            <div class="form-group col-xs-8">
                <label for="name">Name:</label>
                <input type="text" class="form-control input-lg" name="name">
            </div>

            <div class="form-group col-xs-8">
                <label for="address">Address</label>
                <input type="text" class="form-control input-lg" name="address">
            </div>

            <div class="form-group col-xs-8">
                  <input type="submit" value="Add" class="btn btn-primary"/>
            </div>

        </form>

    </div> 
</div>
<%} else { %>
<%@include file="header/lowadmin.html" %> 

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            <center>  Adding new Auther </center> 
        </h1>

    </div>
</div>
<div class="row">
    <div class="col-md-12">    
        <form action="AddAuther" role="form" >
            <div class="form-group col-xs-8">
                <label for="name">Name:</label>
                <input type="text" class="form-control input-lg" name="name">
            </div>

            <div class="form-group col-xs-8">
                <label for="address">Address</label>
                <input type="text" class="form-control input-lg" name="address">
            </div>

            <div class="form-group col-xs-8">
                  <input type="submit" value="Add" class="btn btn-primary"/>
            </div>

        </form>

    </div> 
</div>
<% }  } %>
<%@include file="footer/footer.html" %>

