package com.loginCustomer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogOut
 */
@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<hr>");
		out.print("<h1>");
		out.print("<a href='customerLogin.html'>Login</a> &nbsp &nbsp");
		out.print("<a href='Profile'>Card</a>&nbsp &nbsp");
		out.print("<a href='LogOut'>LogOut</a>");
		out.print("</h1>");
		out.print("<hr>");
		Cookie ck=new Cookie("ckid","");
		response.addCookie(ck);
		ck.setMaxAge(0);
		out.print("LOG OUT SUCCESSFULLY");
		request.getRequestDispatcher("index.html").forward(request, response);
		
	}
}
