<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<title>Shipping and billing address</title>
</head>
<body>
<jsp:include page="Top.jsp"></jsp:include>
	<div class="container" style="margin-top:100px">
	
		<form class="form-horizontal" role="form" method="post" action="Address">
		
		  <div class="well">
		  
		  	  <h4 class="text-center">Shipping address</h4>
		  	  
			  <div class="form-group">
			    <label for="inputName" class="col-sm-2 control-label">Name</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="inputName" placeholder="Name">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputSurname" class="col-sm-2 control-label">Surname</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="inputSurname" placeholder="Surname">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputAdress" class="col-sm-2 control-label">Address</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="inputAddress" placeholder="Address">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputCity" class="col-sm-2 control-label">City</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="inputCity" placeholder="City">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputZIPcode" class="col-sm-2 control-label">ZIPcode</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="inputZIPcode" placeholder="ZIPcode">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputCountry" class="col-sm-2 control-label">Country</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="inputCountry" placeholder="Country">
			    </div>
			  </div>
			  
		  </div>
		  
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <div class="checkbox">
		        <label>
		          <input type="checkbox" checked name="sameAddress"> Billing address is the same
		        </label>
		      </div>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <span>Choose your shipment type: </span>
		      <label>
		        <input type="radio" name="shipmentType" value="1" checked> Regular
		        <input type="radio" name="shipmentType" value="2"> Express
		      </label>
		    </div>
		  </div>
		  
		  <div class="sliding">
			  <div class="well">
			  
			  	  <h4 class="text-center">Billing address</h4>
			  	  
				  <div class="form-group">
				    <label for="inputName2" class="col-sm-2 control-label">Name</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" name="inputName2" placeholder="Name">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputSurname2" class="col-sm-2 control-label">Surname</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" name="inputSurname2" placeholder="Surname">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputAdress2" class="col-sm-2 control-label">Address</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" name="inputAddress2" placeholder="Address">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputCity2" class="col-sm-2 control-label">City</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" name="inputCity2" placeholder="City">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputZIPcode2" class="col-sm-2 control-label">ZIPcode</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" name="inputZIPcode2" placeholder="ZIPcode">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputCountry2" class="col-sm-2 control-label">Country</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" name="inputCountry2" placeholder="Country">
				    </div>
				  </div>
				  
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
<!--  
	<jsp:include page="Checkout.jsp" />
-->
<script type="text/javascript">
$(document).ready(function(){
    $(".sliding").slideUp();
});
$('input:checkbox').change(function () {
    if ($(this).is(":checked")){
        $(".sliding").slideUp();
    } else {
        $(".sliding").slideDown();
    }
});


</script>
</body>
</html>