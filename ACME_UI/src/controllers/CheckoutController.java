package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.imse.grp4.data.Product;
import com.imse.grp4.data.ProductManager;

/**
 * Servlet implementation class CheckoutController
 */
@WebServlet(description = "Controlls checkout process")
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true); 
		Hashtable<Product, Integer> products = new Hashtable<Product, Integer>();
		
		Product pr1 = new Product();
		Product pr2 = new Product();
		Product pr3 = new Product();
		
		//get product IDs from request
	
		
		pr1.setProductName("Nexus5"); pr1.setProductPrice(25); pr1.setId(1); pr1.setProductWeight(2); pr1.setAvailabilityDate(new Date());
		pr2.setProductName("Nexus4"); pr2.setProductPrice(15); pr2.setId(2); pr2.setProductWeight(1); pr2.setAvailabilityDate(new Date());
		pr3.setProductName("Nexus3"); pr3.setProductPrice(5); pr3.setId(3); pr3.setProductWeight(3); pr3.setAvailabilityDate(new Date());
		
		ProductManager pm = new ProductManager();
		pm.getProductDetail(1);
		
		products.put(pm.getProductDetail(1), 25);
		products.put(pm.getProductDetail(2), 10);
		products.put(pm.getProductDetail(3), 13);
		
		session.setAttribute("Products", products);
		RequestDispatcher view = request.getRequestDispatcher("/Checkout.jsp");
		view.forward(request, response);
	}

}
