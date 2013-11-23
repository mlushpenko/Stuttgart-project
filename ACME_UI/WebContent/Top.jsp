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
        <div >
          
          <a class="navbar-brand" href="#">ACME Web Shop Group 4    <b> </b>!     <span class="label label-success">${user.firstName}</span></a>
        
		
        </div>
          <div class="navbar-collapse collapse" style="float:right; padding-right: 0px; padding-left: 0px;" >    
  			<form  style="float:left;"  class="navbar-form navbar-right" action="SignUp" method="post">
  			 <input value="" name="signupurl"   id="signupurl" type="hidden"  style="width:0px;">
          <button type="submit"   class="btn btn-success" >Sign up</button> 
          </form>
          </div>
      
      <div class="navbar-collapse collapse" style="float:right; padding-right: 0px; padding-left: 0px;" >
          <form class="navbar-form navbar-right" style="float:left;" onsubmit="return clearhtmlsession()" action="Login" method="post">
            <input value="" name="url"   id="url" type="hidden"  style="width:0px;">
            <div class="form-group" id="email"  style="margin-right:3px;" >
              <input type="text" name="email"  placeholder="User Name" class="form-control">
            </div>
            <div class="form-group"  id="password" style="margin-right:3px;" >
              <input type="password" name="password"  placeholder="Password" class="form-control">
            </div>
            <button type="submit" id="signin" class="btn btn-success">Sign in</button>
          
           
            </form>
           
        
        </div>
        
         
        </div>
    </div>
 <script type="text/javascript">

   if('${user}'!="")
  {
	   document.getElementById("signin").innerHTML="SignOut";
 document.getElementById("email").style.visibility="hidden";
 document.getElementById("password").style.visibility="hidden";
  }
   document.getElementById("url").value=location; 
   document.getElementById("signupurl").value=location;
  </script>       
         
</body>
</html>