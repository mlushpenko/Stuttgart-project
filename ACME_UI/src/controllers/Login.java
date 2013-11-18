package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.imse.grp4.data.Account;
import com.imse.grp4.data.AccountManager;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("email") != null
				&& !request.getParameter("email").isEmpty()
				&& request.getParameter("password") != null
				&& !request.getParameter("password").isEmpty()) {

			AccountManager am = new AccountManager();
			Account d = am.getProductDetail(request.getParameter("email"),
					request.getParameter("password"));

			if (d != null) {
				HttpSession session = request.getSession(true);
				session.setAttribute("firstname", d.getFirstName());
			} else {

			}
		} else {
			HttpSession session = request.getSession(true);
			session.invalidate();
		}

		getServletContext().getNamedDispatcher("Index").forward(request,
				response);

	}

}
