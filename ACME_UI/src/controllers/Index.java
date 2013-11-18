package controllers;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.imse.grp4.data.ProductManager;

public class Index extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
	    ProductManager pm = new ProductManager();
	    System.out.print(pm.getProducts().size());
		
		  request.setAttribute("PassingObj", pm.getProducts());
		  if(request.getParameter("firstname")!=null||request.getParameter("firstname")!="")
			{
			  request.setAttribute("firstname", request.getParameter("firstname"));
			}
	  getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
		
	
		
	}

}
