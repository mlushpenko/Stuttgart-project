package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imse.grp4.data.Product;
import com.imse.grp4.data.ProductManager;

public class OrderServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String productids=	request.getParameter("productids");
		String[] animalsArray = productids.split(",");
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		ProductManager pm = new ProductManager();
		
		for (String product : animalsArray) {
			products.add(pm.getProductDetail(Integer.valueOf(product)));
		}
		
		  request.setAttribute("PassingObj", products);
		  getServletContext().getRequestDispatcher("/vieworder.jsp").forward(request, response);
	}
	
}