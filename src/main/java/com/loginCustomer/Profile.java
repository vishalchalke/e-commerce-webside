package com.loginCustomer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<hr>");
		out.print("<h1>");
		out.print("<a href='customerLogin.html'>Login</a> &nbsp &nbsp");
		out.print("<a href='Profile'>Profile</a>&nbsp &nbsp");
		out.print("<a href='LogOut'>LogOut</a>");
		out.print("</h1>");

		out.print("<hr>");
		
		Cookie ck[] = request.getCookies();

		if (ck != null) {
			boolean flag = true;
			for (int i = 0; i < ck.length; i++) {
				if (ck[i].getValue().equals("vishal")) {
					flag = false;
					out.print("<b>" + "Welcome To Profile " + ck[i].getValue() + "</b> <br>");
					request.getRequestDispatcher("ReadProductServlet").include(request, response);
					break;
				}
			}
			if (flag) {
				out.print("<b>Please Login Again !!!! </b>");
				request.getRequestDispatcher("customerLogin.html").include(request, response);
			}

		} else {
			out.print("<b>Please Login First !!!! </b>");
			request.getRequestDispatcher("customerLogin.html").include(request, response);
		}

	}

}
