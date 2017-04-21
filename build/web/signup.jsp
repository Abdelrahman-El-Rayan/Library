<%-- 
    Document   : sgnup
    Created on : Dec 4, 2015, 3:43:44 PM
    Author     : CASPER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title> Admin Template</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/sb-admin.css" rel="stylesheet">
        <link href="css/plugins/morris.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="css/custom.css" rel="stylesheet" />

        <script type="text/javascript">
           
                    function validate()
                    {
                        var password = document.forms["sign"]["password"].value;
                        var conpassword = document.forms["sign"]["conpassword"].value;
                        var gender = document.forms["sign"]["gender"].value;
                        
                         if (password != conpassword)
                        {
                            alert("password must be matches");
                            return false;
                        }
                        else if (gender=null || gender=="")
                        {
                            alert("choose gender");
                            return false;
                        }
                       
                        else{
                          
                    }   return true;
                    }

        </script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row" >
                <div class="col-sm-12">
                    <div class="cen">
                        <form action="Signup" method="POST"  role="form" name="sign" onsubmit="return validate()" >
                            <h2>Sign up</h2>

                            <div class="form-group col-xs-8 ">
                                <label for="username ">username </label>
                                <input type="text" class="form-control" name="username" required >
                            </div>

                            <div class="form-group col-xs-8">
                                <label for="password ">password </label>
                                <input type="password" class="form-control" name="password" required >
                            </div>
                            <div class="form-group col-xs-8">
                                <label for="conpwd ">confirm password </label>
                                <input type="password" class="form-control" name="conpassword" required >
                            </div>

                            <!-- validate -->
                            <div class="form-group col-xs-8">
                                <label for="gender ">Gender</label>
                                <input type="radio" name="gender" value="male" /> Male
                                <input type="radio" name="gender" value="female" >female

                            </div>

                            <div class="form-group col-xs-8">
                                <label for="phone">phone </label>
                                <input type="text" class="form-control" name="phone" required >
                            </div>
                            <div class="form-group col-xs-8">
                                <label for="address">Address</label>
                                <input type="text" class="form-control" name="address" required >
                            </div>

                            <div class="form-group col-xs-8">
                                <label for="email">Email</label>
                                <input type="email" class="form-control" name="email" required >
                            </div>

                            <div class="form-group col-xs-8">
                                <input type="submit" value="Sign up" class="btn btn-primary"/>
                            </div>




                        </form>

                    </div>
                </div>

            </div>
        </div>
        <script src="js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="js/plugins/morris/raphael.min.js"></script>
        <script src="js/plugins/morris/morris.min.js"></script>
        <script src="js/plugins/morris/morris-data.js"></script>
    </body>
</html>
