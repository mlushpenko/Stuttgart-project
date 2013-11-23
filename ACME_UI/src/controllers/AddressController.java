package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Holder;

import acme.Acme;
import acme.AcmeRequest;
import acme.AcmeResponse;
import acme.Shipment;
import acme.ShipmentResponse;

import com.imse.grp4.data.Product;

/**
 * Servlet implementation class AddressController
 */
@WebServlet("/AddressController")
public class AddressController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Acme service = new Acme();
	private static int orderID = 10;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		Hashtable<Product, Integer> products = (Hashtable<Product, Integer>) session
				.getAttribute("Products");

		String query = request.getQueryString();

		Enumeration<Product> enumKey = products.keys();

		float weight = 0;

		// update products and their ordered amounts and calculate total weight
		while (enumKey.hasMoreElements()) {
			Product product = enumKey.nextElement();
			String name = product.getProductName();

			if (query.matches(".*" + name.trim() + ".*")) {
				int amount = 0;
				if (query.split(name.trim()).length > 1) {
					amount = Integer.parseInt(query.split(name.trim())[1]
							.split(",")[0].trim().substring(1));
				} else {
					amount = Integer.parseInt(query.split(name.trim())[0]
							.split(",")[0].trim().substring(1));
				}
				products.put(product, amount);

				weight += product.getProductWeight() * amount;
			} else {
				products.remove(product);
			}
		}

		// start ordering process
		AcmeRequest payload = new AcmeRequest();
		orderID += 1; //new order id for each request
		payload.setOrderid(orderID);
		ArrayList<acme.Product> array = (ArrayList<acme.Product>) payload
				.getInput();
		for (Product product : products.keySet()) {
			acme.Product pr = new acme.Product();
			pr.setId(product.getId());
			pr.setAmount(products.get(product));
			array.add(pr);
		}
		AcmeResponse result = service.getAcmeSOAP11PortHttp().process(payload);

		//put objects into the session
		session.setAttribute("Products", products);
		session.setAttribute("ProductsPrice",
				query.split("TotalPrice")[1].trim().substring(1));
		session.setAttribute("TotalWeight", weight);
		session.setAttribute("OrderID", orderID);

		//proceed or finish process and return to home paga if negative answer
		RequestDispatcher view = null;
		if (result.getResult().equals("true")) {
			response.getWriter().print("<html><body><script>alert('This is shipment page')</script></body></html>");
			view = request.getRequestDispatcher("/Address.jsp");
		} else {
			
			view = request.getRequestDispatcher("/home.jsp");
		}
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		float weight = (Float) session.getAttribute("TotalWeight");

		String address = request.getParameter("inputName") + " "
				+ request.getParameter("inputSurname") + " "
				+ request.getParameter("inputAddress") + " "
				+ request.getParameter("inputCity") + " "
				+ request.getParameter("inputZIPcode") + " "
				+ request.getParameter("inputCountry");

		String shipmentType = request.getParameter("shipmentType");

		String billingAddress = address;

		if (!request.getParameter("sameAddress").equals("on")) {
			billingAddress = request.getParameter("inputName2") + " "
					+ request.getParameter("inputSurname2") + " "
					+ request.getParameter("inputAddress2") + " "
					+ request.getParameter("inputCity2") + " "
					+ request.getParameter("inputZIPcode2") + " "
					+ request.getParameter("inputCountry2");
		}
		
		//continue with process
		Holder<String> out = new Holder<String>();
		Holder<String> date = new Holder<String>();
		service.getAcmeSOAP11PortHttp().shipment(billingAddress, Integer.parseInt(shipmentType), weight, orderID, out, date);

		session.setAttribute("billingAddress", billingAddress);
		session.setAttribute("ShippingCosts", out.value);
		session.setAttribute("DeliveryDate", date.value);
		
		//request.getRequestDispatcher("/Payment.jsp").forward(request, response);
		response.sendRedirect("/ACME_UI/Payment");
	}

}
