<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div >
          
          <a class="navbar-brand" href="#">ACME Web Shop Group 4    <b> </b>!     <span class="label label-success">${firstname}</span></a>
        
		
        </div>
        </div>
    </div>    
        <h3 style="padding-top: 60px;"><span class="label label-success">Your Order</span></h3>
    <div class="list-group" style="margin-top:100px; padding:20px;">
     <div class="row">
      <c:forEach var="currentCustomer" items="${PassingObj}">
      
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <div class="caption">
        <h3>${currentCustomer.productName}</h3>
      <h4>Price : ${currentCustomer.productPrice} Euro</h4>
      <h5>Available Stock : ${currentCustomer.stockAmount}</h5>
         <input value="hello" name="productids"   id="a" type="hidden" placeholder="User Name" class="form-control" style="width:0px;">
         
        <p><a href="#" class="label label-danger" role="button" id=${currentCustomer.id} name=${currentCustomer.productName}  onclick = add(this.id,this.name);
};>Remove</a> </p>
      </div>
    </div>
  </div>

      
   
</c:forEach>
  </div>  

 
</div>
 
</body>
</html>