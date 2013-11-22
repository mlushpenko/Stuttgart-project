package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.imse.grp4.data.Account;
import com.imse.grp4.data.AccountManager;

public class SignUp extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("firstname")!=null&&request.getParameter("lastname")!=null&&request.getParameter("email")!=null&&request.getParameter("tel")!=null&&request.getParameter("password")!=null)
		{
			long LOWER_RANGE = 0; //assign lower range value
			 long UPPER_RANGE = 1000000; //assign upper range value
			 Random random = new Random();


			 long randomValue = LOWER_RANGE + 
			                           (long)(random.nextDouble()*(UPPER_RANGE - LOWER_RANGE));
					
			Account account = new Account(request.getParameter("email"),request.getParameter("password"),request.getParameter("firstname"),request.getParameter("lastname"));
			account.setPhoneNumber(request.getParameter("tel"));
			
			account.setAccountID(randomValue);
			AccountManager am = new AccountManager();
			am.createAccount(account);
			
		//	request.setAttribute("name", request.getParameter("firstname"));
		//	HttpSession session = request.getSession(true);
		
			getServletContext().getNamedDispatcher("Index").forward(request, response);
			
			
			
		}else
		{
			  getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
			
		}
	
			
		}
		
		
		


}
