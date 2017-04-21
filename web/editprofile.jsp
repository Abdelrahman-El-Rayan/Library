<%-- 
    Document   : editprofile
    Created on : Dec 4, 2015, 7:32:37 PM
    Author     : CASPER
--%>

<%@page import="Model.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header/userheader.html" %>






  <%
            Member mem = (Member) session.getAttribute("member");
           if (mem != null ){
               String username = mem.getUsername();
            String password = mem.getPassword();

            Member m = new Member();
            m = mem.getInfo(username, password);
            
            
            
            String gender = m.getGender();
    
           


        %>
        <div class="row" >
                 <div class="col-sm-12">
                      
                   <form action="EditProfile" method="POST" role="form" >
          

             <div class="form-group col-xs-8 ">
                <label for="username ">username </label>
                <input type="text" class="form-control" name="username"    value="<%= m.getUsername()%>">
            </div> 
             <div class="form-group col-xs-8 ">
                <label for="password ">password </label>
                <input type="password" class="form-control" name="password" value="<%= m.getPassword()%>">
            </div> 
            <div class="form-group col-xs-8 ">
                <label for="confirmpassword ">confirm password </label>
                <input type="password" class="form-control" name="conpassword" value="<%= m.getPassword()%>">
            </div> 
            
            <div class="form-group col-xs-8 ">
                <label for="gender ">Gender </label>
               
            
         
               
            <% if (gender.equals("male")) {%>
            <div class="radio-inline">
            <label> <input type="radio"  type="radio" name="gender" value="male" checked /> Male</label>
            </div>
            <div class="radio-inline">
            <label><input type="radio"   name="gender" value="female"   />female</label>
            </div>
            <% } else { %>
             <div class="radio-inline">
                 <label>  <input type="radio"  name="gender" value="male"    /> Male </label>
                 </div>
             <div class="radio-inline">
                 <label><input type="radio" name="gender" value="female" checked   />female</label>
            </div>
            <% }%>
           </div> 
             <div class="form-group col-xs-8 ">
                <label for="phone">phone </label>
                <input type="text" class="form-control" name="phone" value="<%= m.getPhone()%>" >
            </div> 
            
             <div class="form-group col-xs-8 ">
                <label for="address">Address </label>
                <input type="text" class="form-control" name="address" value="<%= m.getAddress()%>" >
            </div> 
            
          <div class="form-group col-xs-8 ">
                <label for="address">Email </label>
                <input type="text" class="form-control" name="email" value="<%= m.getEmail()%>" >
            </div> 
            

            
<div class="form-group col-xs-8 ">
              
                <input type="submit" value="Update" class="btn btn-primary"/>
           
            </div> 


        </form>
         </div>
        </div>
           <% } else {%> 
           <h2> Please Login Again </h2>
<%} %> 
            
   <%@include  file="footer/footer.html" %>
