
<%@page import="Model.Book"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="header/userheader.html" %>


<%

    Enumeration e = request.getParameterNames();
    String boId = (String) e.nextElement();
    int bookId = Integer.parseInt(boId);
    Book b = new Book();
    String title = b.getBookTitle(bookId);

%>
<div class="row">
    <div class="col-md-12">    
        <script>
            function validate()
            {

                var startdate = document.forms["borform"]["from"].value;
                var returndate = document.forms["borform"]["to"].value;
                var today = new Date();
                if (startdate < today)
                {
                    alert("please enter valid  start borrow date ");
                    return false;
                }
                else if (returndate < today)
                {
                    alert("Return date must be later than today ");
                    return false;
                }
                else if (returndate < startdate)
                         {
                    alert("Return Date must be later than borrow date ");
                    return false;
                }

                else {
                   
                    return true;
                }
            }

        </script>

        <form  action="BorrowBook" role="form" name="borform" onsubmit="return validate();">
            <div class="form-group col-xs-8">
                <label for="booktitle">Book Title</label>
                <input type="text" class="form-control" name="title" value="<%= title%>" readonly>
            </div>

            <div class="form-group col-xs-8">
                <label for="sdate">Starting Date</label>
                <input type="date" name="from" class="form-control input-lg" required>
            </div>
            <div class="form-group col-xs-8">
                <label for="rdate">Return Date </label>
                <input type="date" name="to"  class="form-control input-lg" required >
            </div>


            <div class="form-group col-xs-8 ">
                <input type="submit" value="Borrow" class="btn btn-primary" > 
            </div>

        </form>
    </div>
</div>
</body>
</html>
