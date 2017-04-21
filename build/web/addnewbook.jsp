
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page   import="Model.Admin" %>
<%
    Admin add = (Admin) session.getAttribute("admin");
    if (add != null) {
        String username = add.getUsername();
        String password = add.getPassword();
        String lev = add.getLevel(username, password);
        if (lev.equals("top")) { %>
<%@include file="header/header.html" %> 
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Adding New Book 
        </h1>

    </div>
</div>
<%
    Admin ad = new Admin();

%>
<div class="row">
    <div class="col-md-12">    

        <form action="AddBook" role="form" >
            <div class="form-group col-xs-8">
                <label for="booktitle">Book Title</label>
                <input type="text" class="form-control" name="title">
            </div>

            <div class="form-group col-xs-8">
                <label for="pagenumber">Page Number</label>
                <input type="text" class="form-control input-lg" name="pageno">
            </div>
            <div class="form-group col-xs-8">
                <label for="Edition">Edition</label>
                <input type="text" class="form-control input-lg" name="edition">
            </div>


            <div class="form-group col-xs-8">
                  <label for="authername">Auther Name</label>
                  <select name="authername" class="form-control input-lg">
                    <% ArrayList autherName = ad.getName("auther");
                        for (int i = 0; i < autherName.size(); i++) {
                    %>

                    <option value="<%= autherName.get(i)%>"> <%= autherName.get(i)%></option> 
                    <% }%>
                </select>
            </div>

            <div class="form-group col-xs-8">
                  <label for="category">Category Name</label>
                  <select name="catname" class="form-control input-lg"> 
                    <%
                        ArrayList catName = ad.getName("category");
                        for (int i = 0; i < catName.size(); i++) {
                    %>

                    <option value="<%= catName.get(i)%>"> <%= catName.get(i)%></option> 
                    <% }%>
                </select>
            </div>

            <div class="form-group col-xs-8">
                  <label for="publish">Publisher Name</label>
                  <select name="publisher" class="form-control input-lg"> 
                    <%
                        ArrayList pubName = ad.getName("publisher");
                        for (int i = 0; i < pubName.size(); i++) {
                    %>

                    <option value="<%= pubName.get(i)%>"> <%= pubName.get(i)%></option> 
                    <% }%>
                </select>
            </div>

            <div class="form-group col-xs-8">
                  <label for="avail">Availability</label>
                  <select name="avail" class="form-control input-lg"> 

                    <option value="0">Available</option> 
                    <option value="1">Not Available</option> 

                </select>
            </div>


            <div class="form-group col-xs-8">
                  <input type="submit" value="Add" class="btn btn-primary"/>
            </div>

        </form>

    </div> 
</div>
<% } else { %>
<%@include file="header/lowadmin.html" %>  
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Adding New Book 
        </h1>

    </div>
</div>
<%
    Admin ad = new Admin();

%>
<div class="row">
    <div class="col-md-12">    

        <form action="AddBook" role="form" >
            <div class="form-group col-xs-8">
                <label for="booktitle">Book Title</label>
                <input type="text" class="form-control" name="title">
            </div>

            <div class="form-group col-xs-8">
                <label for="pagenumber">Page Number</label>
                <input type="text" class="form-control input-lg" name="pageno">
            </div>
            <div class="form-group col-xs-8">
                <label for="Edition">Edition</label>
                <input type="text" class="form-control input-lg" name="edition">
            </div>


            <div class="form-group col-xs-8">
                  <label for="authername">Auther Name</label>
                  <select name="authername" class="form-control input-lg">
                    <% ArrayList autherName = ad.getName("auther");
                        for (int i = 0; i < autherName.size(); i++) {
                    %>

                    <option value="<%= autherName.get(i)%>"> <%= autherName.get(i)%></option> 
                    <% }%>
                </select>
            </div>

            <div class="form-group col-xs-8">
                  <label for="category">Category Name</label>
                  <select name="catname" class="form-control input-lg"> 
                    <%
                        ArrayList catName = ad.getName("category");
                        for (int i = 0; i < catName.size(); i++) {
                    %>

                    <option value="<%= catName.get(i)%>"> <%= catName.get(i)%></option> 
                    <% }%>
                </select>
            </div>

            <div class="form-group col-xs-8">
                  <label for="publish">Publisher Name</label>
                  <select name="publisher" class="form-control input-lg"> 
                    <%
                        ArrayList pubName = ad.getName("publisher");
                        for (int i = 0; i < pubName.size(); i++) {
                    %>

                    <option value="<%= pubName.get(i)%>"> <%= pubName.get(i)%></option> 
                    <% }%>
                </select>
            </div>

            <div class="form-group col-xs-8">
                  <label for="avail">Availability</label>
                  <select name="avail" class="form-control input-lg"> 

                    <option value="0">Available</option> 
                    <option value="1">Not Available</option> 

                </select>
            </div>


            <div class="form-group col-xs-8">
                  <input type="submit" value="Add" class="btn btn-primary"/>
            </div>

        </form>

    </div> 
</div>
<% }
    }%>
<%@include file="footer/footer.html" %>



