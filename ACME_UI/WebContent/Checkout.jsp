<%@page import="java.util.Hashtable"%>
<%@page import="java.util.Enumeration" %>
<%@page import="com.imse.grp4.data.Product"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New order</title>
</head>
<body>
<jsp:include page="Top.jsp"></jsp:include>
<% Hashtable<Product,Integer> collection = (Hashtable<Product,Integer>)session.getAttribute("Products");
   Enumeration<Product> products = collection.keys();
   float price=0;
   while(products.hasMoreElements()){
	Product product = products.nextElement();
	int amount = collection.get(product);
   	price += product.getProductPrice()*amount;
   }
%>
	<div class="container" style="margin-top:100px">
		<div>
			<ul class="list-group">
				<c:forEach items="${Products}" var="product">
					<li class="list-group-item" style="padding-bottom:5px">
						<div class="${product.key.productName}" >
						    <span class="col-md-2"><c:out value="${product.key.productName}"></c:out></span>
							<span class="col-md-1 price">$<c:out value="${product.key.productPrice}"></c:out></span>
							<span class="col-md-1">Quantity: <span class="badge ${product.key.productName}"><c:out value="${product.value}"></c:out></span></span>
							<span class="col-md-5"><c:out value="${product.key.availabilityDate}"></c:out></span>
							<span class="col-md-3">
								<button type="button" class="btn btn-xs btn-danger">remove</button>
								<span style="width:20px">
									<select class="${product.key.productName}">
									</select> 
								</span>
							</span>
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>
		<div>
			<p class="text-right" id="totalPrice">Total price: $<%=price%></p>
			<p class="text-right">
				<button type="button" class="btn btn-default">Cancel</button>
				<a class="btn btn-primary" role="button" href="Address.jsp">Next</a>
			</p>
		</div>
	</div>
<script type="text/javascript">
$(function () {

    function initDropwodn(className) {
        $("select." + className).children().remove();
        for (var i = 0; i < $("span>.badge." + className).text(); i++) {
            $("select." + className).append("<option>" + (i + 1) + "</option>");
        }
    }

    function initDropdowns() {
        for (var i = 0; i < $("ul>li>div").length; i++) {
            var className = $("ul>li>div")[i].className;
            initDropwodn(className);
        }
    }
    
    function getPrice(){
    	var prices = $("span.price");
    	var price = 0;
    	//alert(prices[0]);
    	for (var i=0; i<prices.length; i++){
    		var amount = prices[i].siblings("span>.badge").text();
    		alert(amount);
    		price += prices[i].innerText*20;
    	}
    }

    initDropdowns();

    $(".btn-danger").click(function () {
        var className = $(this).parent().siblings(".col-md-2").text();
        var selected = $("select." + className + "  option:selected").text();
        var quantity = $("span>.badge." + className).text();
        if (selected == quantity) {
            $(this).parent().parent().remove();
            $("#totalPrice").text("Total price: $" + getPrice());
        } else {
            $("span>.badge." + className).text(quantity - selected);
            initDropwodn(className);
            $("#totalPrice").text("Total price: $" + getPrice());
        }
        
    });
});
</script>
</body>
</html>