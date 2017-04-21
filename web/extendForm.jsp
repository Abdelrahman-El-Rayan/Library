
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
    String dtArray[]=b.startAndReturn(bookId);
    String sdate =dtArray[0];
    String rdate = dtArray[1];
    %>
    <div class="row">
    <div class="col-md-12">  
        <script>
            
         function validate()
            {

                var returndate = document.forms["extendform"]["rdate"].value;
                var newdate = document.forms["extendform"]["ndate"].value;
                
                var today = new Date();
                if (newdate < returndate)
                {
                    alert("Please Enter correct new Date");
                    return false;
                } else if (newdate < today){
                alert("Please Enter correct new Date");
                    return false;
        }     
               else {
                   
                    return true;
                }
            }

        </script>

        <form  action="extendDate" role="form" name="extendform" onsubmit="return validate();">
       
            <div class="form-group col-xs-8">
                <label for="booktitle">Book Title</label>
                <input type="text" class="form-control" name="title" value="<%= title %>" readonly>
            </div>

  
            <div class="form-group col-xs-8">
                <label for="startdate">Start Date </label>
                <input type="text" class="form-control" name="sdate" value="<%= sdate %>" readonly>
            </div>
            
             <div class="form-group col-xs-8">
                <label for="startdate"> Return Date </label>
                <input type="date" class="form-control" name="rdate" value="<%= rdate %>" readonly>
            </div>
            <div class="form-group col-xs-8">
                <label for="startdate"> New Date </label>
                <input type="date" class="form-control" name="ndate" required>
            </div>
            <div class="form-group col-xs-8 ">
                <input type="submit" value="Extend" class="btn btn-danger"> 
            </div>
           
    </form>
    </div>
    </div>
    </body>
</html>

