package com.loginCustomer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("uname");
	String pass=request.getParameter("psw");

			out.print("<a href='index.html'>"+"LOGIN"+"</a>");
	   		out.print("<br>");
	   		out.print("<a href='ProfileServlet'>"+"PROFILE"+"</a>");
	   		out.print("<br>");
	   		out.print("<a href='LogOutServlet'>"+"LOGOUT"+"</a>");
	   		out.print("<br>");
	   		if(name.equals("vishalchalke")&&pass.equals("vishal123")){
	   		HttpSession session=request.getSession();
	   		session.setAttribute("seesionValue", name);
	   		out.print("Welcome To Login <h1>  "+name+"</h1>");
	             }    else{
	            	 out.print("<h1>session is not available</h1>");
	     			request.getRequestDispatcher("login.jsp").include(request, response);
	            }

    
}


}
