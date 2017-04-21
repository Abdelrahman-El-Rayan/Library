<%-- 
    Document   : Sendmail
    Created on : Dec 26, 2015, 4:50:11 AM
    Author     : CASPER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="newjsp.jsp" method="POST">
            
          to  <input type="text" name="to" value="" />
          from  <input type="text" name="from" value="" />
          subject  <input type="text" name="subject" value="" />
           body <textarea name="body" rows="4" cols="20">
            </textarea>
           <input type="submit" value="send" />
        </form>
    </body>
</html>
