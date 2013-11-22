<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>ACME WebShop Group 4</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

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
<jsp:include page="Top.jsp"></jsp:include>
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

   if('${firstname}'!="")
  {
	   document.getElementById("signin").innerHTML="SignOut";
 document.getElementById("email").style.visibility="hidden";
 document.getElementById("password").style.visibility="hidden";
  }
  </script>
 

</html>