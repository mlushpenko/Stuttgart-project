<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment data</title>
</head>
<body>
<% float shippingCosts = (Float.parseFloat((String) session.getAttribute("ShippingCosts")));
   float productsPrice = (Float.parseFloat((String) session.getAttribute("ProductsPrice")));
   float amount = shippingCosts + productsPrice;
   session.setAttribute("TotalPrice", amount);%>
<jsp:include page="Top.jsp"></jsp:include>
	<div class="container" style="margin-top:100px">
		
		<div class="panel panel-info">
			<div class="panel-heading">Summary</div>
			<div class="panel-body">
				<p>Order price: $${ProductsPrice}</p>
				<p>Shipment price: $${ShippingCosts}</p>
				<p>Total price: $<%= amount  %></p>
				<p>Estimated delivery date: ${DeliveryDate}</p>
			</div>
		</div>
	
		<form class="form-horizontal" role="form" method="post" action="Payment">
		  
		  <div class="form-group">
		    <label for="inputName" class="col-sm-2 control-label">Name</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="inputName" placeholder="Name and Surname">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="inputCardNumber" class="col-sm-2 control-label">CardNumber</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="inputCardNumber" placeholder="CardNumber 16 digits long">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="inputCVCcode" class="col-sm-2 control-label">CVCcode</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="inputCVCcode" placeholder="CVCcode 3 digits long">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		    	<p class="text-right">
			        <a class="btn btn-default" role="button" href="/ACME_UI/Index">Cancel</a>
					<button type="submit" class="btn btn-primary">Next</button>
				</p>
		    </div>
		  </div>
		
		</form>
	
	</div>

</body>
</html>