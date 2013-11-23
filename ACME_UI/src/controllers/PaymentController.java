package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import acme.Acme;

/**
 * Servlet implementation class PaymentController
 */
@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("/Payment.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		Acme service = new Acme();
		
		int orderid = ((Integer) session.getAttribute("OrderID")).intValue();
		String name = request.getParameter("inputName");
		String address = (String) session.getAttribute("billingAddress");
		float amount =  (Float) session.getAttribute("TotalPrice");
		long cardnumber = Long.parseLong(request
				.getParameter("inputCardNumber"));
		int cvc = Integer.parseInt(request.getParameter("inputCVCcode"));
		
		String result = service.getAcmeSOAP11PortHttp().payment(orderid, name,
				address, amount, cardnumber, cvc); 

		response.sendRedirect("/ACME_UI/Index");
	}

}
