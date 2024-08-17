package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Product;

/**
 * Servlet implementation class CartListServlet
 */
@WebServlet("/CartListServlet")
public class CartListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	    HttpSession session=request.getSession();
		
	    ArrayList<Product>friend=(ArrayList<Product>) session.getAttribute("ckid");
		
		
		Iterator<Product> itr = friend.iterator();
		out.print("<html>");
		out.print("<head>");
		out.print("<link rel='stylesheet' href='css/table.css'>");
		out.print("</head>");
		out.print("<body>");
		out.print("<script>");
		out.print("</script>");
		out.print("");
		out.print("<div class='box'>");
		out.print(" <div class='box-content'>");
		
		out.print("<table id='customers'>");
		out.print("<tr>");
		out.print("<th>" + "ID" + "</th>");
		out.print("<th>" + "NAME" + "</th>");
		out.print("<th>" + "DISCRIPTION" + "</th>");
		out.print("<th>" + "PRICE" + "</th>");
	    out.print("<th>" + "DELETE" + "</th>");
		out.print("<th>" + "UPDATE" + "</th>");
		
		out.println("<tr>");
		while(itr.hasNext()) {
			Product student = new Product();
			student = itr.next();
			
			out.print("<tr>");
			out.print("<td>" + student.getProductid() + "</td>");
			out.print("<td>" + student.getProductName() + "</td>");
			out.print("<td>" + student.getProductDescription() + "</td>");
			out.print("<td>" + student.getPrice()+ "</td>");
			out.println("<td>");
			out.print("<a href='DeleteProductServlet?id=" + student.getProductid() + "'>" + "Remove" + "</a>");
			out.print("</td>");
			out.print("<td>");
			out.print("<a href='EditProductSerlvet?id=" + student.getProductid() + "'>" + "update" + "</a>");
			out.print("</td>");
			out.print("</tr>");
		}
		
		out.print("</table>");
		out.print("<p>  You are on amazon.com.You can also shop on Amazon india for millions of products with fast local delivery. <a href='NewIndex.jsp'>click here to go to amazon.in&&back Home Page</a></p></div>");
		out.print("</body>");
		out.print("</html>");
	}

}
