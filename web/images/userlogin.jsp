<%-- 
    Document   : userlogin
    Created on : Dec 4, 2015, 11:29:08 PM
    Author     : CASPER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    
    
    
    
    <link rel="stylesheet" href="css/style.css">

   
  </head>

  <body>
       <form method="post" action="LoginforUser">
            
             <h4> Login  </h4>
             <input class="name" type="text" placeholder="Enter Username" name="uname"/>
             <input class="pw" type="password" placeholder="Enter Password" name="password"/>
 
               <input class="button" type="submit" value="Log in"/>
</form>
    </body>
</html>
