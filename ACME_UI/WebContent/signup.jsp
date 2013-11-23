<!DOCTYPE html>
<html>
  <head>
    <title>ACME WebShop Group 4 Sign Up</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
  </head>
    <%
//String cat = "All";
String signupreq = request.getParameter("signupurl").toString();
 
    
  %>
  <body>
    


 <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div >
          
          <a class="navbar-brand" href="#">ACME Web Shop Group 4</a>
          
		
        </div>

        

      
      </div>
    </div>
      <div class="container" style="width:400px; padding-top:100px; height:auto;  position: relative; width: 50%;
    margin: 0 auto;">
    <form class="form-signin" action="SignUp" method="post" >
    <input value=<%=signupreq%> name="signupurl"   id="signupurl" type="hidden"  style="width:0px;">
        <h2 class="form-signin-heading" style="margin:3px;">Please Provide all Details</h2>
        <input type="text" name="firstname" class="form-control" style="margin:3px;"  placeholder="First Name" required="" autofocus="">
         <input type="text" name="lastname" class="form-control" style="margin:3px;" placeholder="Last Name" required="" >
          <input type="text" name="email" class="form-control" style="margin:3px;" placeholder="Email" required="" >
          <input type="tel" name="tel" class="form-control" style="margin:3px;" placeholder="Tel" required="" >
        <input type="password"  id="password" name="password" class="form-control" style="margin:3px;" placeholder="Password" required="" >
         <input type="password" name="pass2" class="form-control" style="margin:3px;" placeholder="Retype Password" id="pass2" onkeyup="checkPass(); return false;">
            <span id="confirmMessage" class="confirmMessage"></span>
        <label class="checkbox" style="margin:3px;">
          <input type="checkbox" value="remember-me" required=""> Accept Terms and Conditions
        </label>
        <button style="margin:3px;" class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button>
      </form>
      </div>
      
  

       
 
      
  </body>
  <script type="text/javascript">
  function checkPass()
  {
      //Store the password field objects into variables ...
      var pass1 = document.getElementById('password');
      var pass2 = document.getElementById('pass2');
      //Store the Confimation Message Object ...
      var message = document.getElementById('confirmMessage');
      //Set the colors we will be using ...
      var goodColor = "#66cc66";
      var badColor = "#ff6666";
      //Compare the values in the password field 
      //and the confirmation field
      if(pass1.value == pass2.value){
          //The passwords match. 
          //Set the color to the good color and inform
          //the user that they have entered the correct password 
          pass2.style.backgroundColor = goodColor;
          message.style.color = goodColor;
          message.innerHTML = "Passwords Match!"
      }else{
          //The passwords do not match.
          //Set the color to the bad color and
          //notify the user.
          pass2.style.backgroundColor = badColor;
          message.style.color = badColor;
          message.innerHTML = "Passwords Do Not Match!"
      }
  }  
  
  </script>

</html>