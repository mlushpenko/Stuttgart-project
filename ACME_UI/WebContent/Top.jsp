<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div>

				<a class="navbar-brand" href="#">ACME Web Shop Group 4 <b> </b>!
					<span class="label label-success"></span></a>


			</div>
			<div class="navbar-collapse collapse"
				style="float: right; padding-right: 0px; padding-left: 0px;">
				<form style="float: left;" class="navbar-form navbar-right"
					action="SignUp" method="post">
					<button type="submit" class="btn btn-success">Sign up</button>
				</form>
			</div>
			<div class="navbar-collapse collapse"
				style="float: right; padding-right: 0px; padding-left: 0px;">
				<form onsubmit="return sum()" method="post" action="OrderServlet"
					class="navbar-form navbar-right" style="float: right;">

					<input value="hello" name="productids" id="a" type="hidden"
						placeholder="User Name" class="form-control" style="width: 0px;">
					<button type="submit" class="btn btn-success">
						<span id="count" class="badge " style="background-color: red;"></span>Check
						Out
					</button>
				</form>
			</div>
			<div class="navbar-collapse collapse" style="float:right; padding-right: 0px; padding-left: 0px;" >
          <form class="navbar-form navbar-right" style="float:left;" onsubmit="return clearhtmlsession()" action="Login" method="post">
            <div class="form-group" id="email"  style="margin-right:3px;" >
              <input type="text" name="email"  placeholder="User Name" class="form-control">
            </div>
            <div class="form-group"  id="password" style="margin-right:3px;" >
              <input type="password" name="password"  placeholder="Password" class="form-control">
            </div>
            <button type="submit" id="signin" class="btn btn-success">Sign in</button>
          
           
            </form>
           
        
        </div>
        </div> </div>
</body>
</html>