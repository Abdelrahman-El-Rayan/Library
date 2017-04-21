<%-- 
    Document   : search
    Created on : Dec 4, 2015, 9:48:01 PM
    Author     : CASPER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include   file="header/userheader.html" %>



<div class="row">
    <div class="col-lg-6">

        <form action="searchResult.jsp" role="form"> 

            <div class="form-group col-xs-4 ">
                <select class="form-control" name="criteria">
                    <option value="category">Category</option>
                    <option value="booktitle">Book title</option>
                    <option value="auther">Auther Name</option>
                    <option value="publisher">publisher </option>
                </select>
            </div>


            <div class="form-group col-xs-8 ">

                <input type="text" name="search"  class="form-control" required/>
            </div>
            <div class="form-group col-xs-8 ">

                <input type="submit" value="search" class="btn btn-success" /> 
            </div>
        </form>
    </div><!-- /input-group -->

</div> 
<%@include  file="footer/footer.html" %>