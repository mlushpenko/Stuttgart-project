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
	
		<form class="form-horizontal" role="form">
		
		  <div class="well">
		  
		  	  <h4 class="text-center">Shipping address</h4>
		  	  
			  <div class="form-group">
			    <label for="inputName" class="col-sm-2 control-label">Name</label>
			    <div class="col-sm-10">
			      <input type="name" class="form-control" id="inputName" placeholder="Name">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputSurname" class="col-sm-2 control-label">Surname</label>
			    <div class="col-sm-10">
			      <input type="surname" class="form-control" id="inputSurname" placeholder="Surname">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputAdress" class="col-sm-2 control-label">Address</label>
			    <div class="col-sm-10">
			      <input type="address" class="form-control" id="inputAddress" placeholder="Address">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputCity" class="col-sm-2 control-label">City</label>
			    <div class="col-sm-10">
			      <input type="city" class="form-control" id="inputCity" placeholder="City">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputZIPcode" class="col-sm-2 control-label">ZIPcode</label>
			    <div class="col-sm-10">
			      <input type="ZIPcode" class="form-control" id="inputZIPcode" placeholder="ZIPcode">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="inputCountry" class="col-sm-2 control-label">Country</label>
			    <div class="col-sm-10">
			      <input type="country" class="form-control" id="inputCountry" placeholder="Country">
			    </div>
			  </div>
			  
		  </div>
		  
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <div class="checkbox">
		        <label>
		          <input type="checkbox" checked> Billing address is the same
		        </label>
		      </div>
		    </div>
		  </div>
		  
		  <div class="sliding">
			  <div class="well">
			  
			  	  <h4 class="text-center">Billing address</h4>
			  	  
				  <div class="form-group">
				    <label for="inputName2" class="col-sm-2 control-label">Name</label>
				    <div class="col-sm-10">
				      <input type="name2" class="form-control" id="inputName2" placeholder="Name">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputSurname2" class="col-sm-2 control-label">Surname</label>
				    <div class="col-sm-10">
				      <input type="surname2" class="form-control" id="inputSurname2" placeholder="Surname">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputAdress2" class="col-sm-2 control-label">Address</label>
				    <div class="col-sm-10">
				      <input type="address2" class="form-control" id="inputAddress2" placeholder="Address">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputCity2" class="col-sm-2 control-label">City</label>
				    <div class="col-sm-10">
				      <input type="city2" class="form-control" id="inputCity2" placeholder="City">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputZIPcode2" class="col-sm-2 control-label">ZIPcode</label>
				    <div class="col-sm-10">
				      <input type="ZIPcode2" class="form-control" id="inputZIPcode2" placeholder="ZIPcode">
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <label for="inputCountry2" class="col-sm-2 control-label">Country</label>
				    <div class="col-sm-10">
				      <input type="country2" class="form-control" id="inputCountry2" placeholder="Country">
				    </div>
				  </div>
				  
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