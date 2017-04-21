<%-- 
    Document   : addnewcategory
    Created on : Dec 4, 2015, 1:07:14 AM
    Author     : CASPER
--%>

<%@page import="Model.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Admin add =(Admin)session.getAttribute("admin"); 
if (add !=null){
String username =add.getUsername(); 
String password=add.getPassword(); 
String lev = add.getLevel(username, password);
if (lev.equals("top")){ %>
   <%@include file="header/header.html" %> 
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Adding new Publisher 
        </h1>

    </div>
</div>
<div class="row">
    <div class="col-md-12">    
        <form action="AddCetegory" role="form" >
            <div class="form-group col-xs-8">
                <label for="category">Category Name</label>
                <input type="text" class="form-control" name="catname">
            </div>

            <div class="form-group col-xs-8">
                  <input type="submit" value="Add" class="btn btn-primary btn-lg"/>
            </div>

        </form>

    </div> 
</div>
<%} else { %>
<%@include file="header/lowadmin.html" %>   
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Adding new Publisher 
        </h1>

    </div>
</div>
<div class="row">
    <div class="col-md-12">    
        <form action="AddCetegory" role="form" >
            <div class="form-group col-xs-8">
                <label for="category">Category Name</label>
                <input type="text" class="form-control" name="catname">
            </div>

            <div class="form-group col-xs-8">
                  <input type="submit" value="Add" class="btn btn-primary btn-lg"/>
            </div>

        </form>

    </div> 
</div>
<% }  } %>
<%@include file="footer/footer.html" %>