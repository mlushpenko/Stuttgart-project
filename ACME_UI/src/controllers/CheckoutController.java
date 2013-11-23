package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO chnage getSession to false if I get session from previous
		HttpSession session = request.getSession(true);
		Hashtable<Product, Integer> products = new Hashtable<Product, Integer>();

		String productids = request.getParameter("productids");
		String[] ids = productids.split(",");

		Set<String> productIDs = new HashSet<String>();
		Collections.addAll(productIDs, ids);
		ProductManager pm = new ProductManager();

		for (String id : productIDs) {
			int count = productids.replace(",", "").trim().length()
					- productids.replace(",", "").replace(id, "").trim()
							.length();
			products.put(pm.getProductDetail(Integer.parseInt(id)), count);
		}

		session.setAttribute("Products", products);
		RequestDispatcher view = request.getRequestDispatcher("/Checkout.jsp");
		view.forward(request, response);
	}

}
