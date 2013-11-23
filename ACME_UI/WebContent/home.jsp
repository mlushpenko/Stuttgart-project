<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>ACME WebShop Group 4</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>

  </head>
  <body>
  <script type="text/javascript">
	   		 var robots = [];
 
  var s=sessionStorage.getItem("robotsInJSON");
  if(s==null){
          sessionStorage.setItem("robotsInJSON", JSON.stringify(robots));
        
          document.getElementById("count").innerHTML="0";
  }

  document.getElementById("count").innerHTML="0";
  
 function clearhtmlsession()
 {
	  sessionStorage.clear();
 }
                  
                  function sum()
                  {
                //  alert(JSON.parse(sessionStorage.getItem("robotsInJSON")).length);
                	  if(JSON.parse(sessionStorage.getItem("robotsInJSON")).length==0||JSON.parse(sessionStorage.getItem("robotsInJSON")).length=="0")
                		  {
                		  alert("Nothing in your Basket");
                		  return false;
                		  
                		  }else
                			  {
                			  var x=window.confirm("Do you want check out for proceed the order")
                			  if(x)
                			  {
                	  sessionStorage.clear();
                			  }else
                				  {
                				  return false;
                				  }
                			  }
                  }
                  
                  function add(id,name)
                  {
                	  var robotsa = JSON.parse(sessionStorage.getItem("robotsInJSON"));
              		  robotsa[robotsa.length] = id;
                      sessionStorage.setItem("robotsInJSON", JSON.stringify(robotsa));
                  
                      document.getElementById("a").value = JSON.parse(sessionStorage.getItem("robotsInJSON"));
                      
                      document.getElementById("count").innerHTML=JSON.parse(sessionStorage.getItem("robotsInJSON")).length;
                 
                    alert(name+ " added to your baseket");
                  }
                  
  
  </script>
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

        <div class="navbar-collapse collapse" style="float:right;padding-right: 0px; padding-left: 0px;" >
        <form onsubmit="return sum()" method="get" action="Checkout" class="navbar-form navbar-right" style="float:right;"> 
            
              <input value="" name="productids"   id="a" type="hidden" placeholder="User Name" class="form-control" style="width:0px;">
             <button type="submit" class="btn btn-success"  ><span id="count" class="badge " style="background-color:red;"></span>Check Out</button>
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
    <div class="list-group" style="margin-top:100px; padding:20px;">
     <div class="row">
      <c:forEach var="currentCustomer" items="${PassingObj}">
      
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <div class="caption">
        <h3>${currentCustomer.productName}</h3>
      <h4>Price : ${currentCustomer.productPrice} Euro</h4>
      <h5>Available Stock : ${currentCustomer.stockAmount}</h5>
       <p>Stock Available Date : ${currentCustomer.availabilityDate}</p>
        <p><a href="#" class="btn btn-primary" role="button" id=${currentCustomer.id} name=${currentCustomer.productName}  onclick = add(this.id,this.name);
};>Add</a> </p>
      </div>
    </div>
  </div>

      
   
</c:forEach>
  </div>  

 
</div>
 
    
  </body>
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
 

</html>