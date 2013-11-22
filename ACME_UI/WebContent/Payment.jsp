<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment data</title>
</head>
<body>

<jsp:include page="Top.jsp"></jsp:include>
	<div class="container" style="margin-top:100px">
		
		<div class="panel panel-info">
			<div class="panel-heading">Summary</div>
			<div class="panel-body">
				<p>Order price: $100</p>
				<p>Shipment price: $100</p>
				<p>Total price: $100</p>
				<p>Estimated delivery date: 31.12.2013</p>
			</div>
		</div>

	
		<form class="form-horizontal" role="form">
		  
		  <div class="form-group">
		    <label for="inputName" class="col-sm-2 control-label">Name</label>
		    <div class="col-sm-10">
		      <input type="name" class="form-control" id="inputName" placeholder="Name">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="inputCardNumber" class="col-sm-2 control-label">CardNumber</label>
		    <div class="col-sm-10">
		      <input type="cardNumber" class="form-control" id="inputCardNumber" placeholder="CardNumber">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="inputCVCcode" class="col-sm-2 control-label">CVCcode</label>
		    <div class="col-sm-10">
		      <input type="cvcCode" class="form-control" id="inputCVCcode" placeholder="CVCcode">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		    	<p class="text-right">
			        <button type="button" class="btn btn-default">Cancel</button>
					<button type="submit" class="btn btn-primary">Next</button>
				</p>
		    </div>
		  </div>
		
		</form>
	
	</div>

</body>
</html>