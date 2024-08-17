package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Product;
import com.service.ProductServiceImple;

@WebServlet("/EditProductSerlvet")
public class EditProductSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	ProductServiceImple service=new ProductServiceImple();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	String id=request.getParameter("id");
	int id1=Integer.parseInt(id);
	RequestDispatcher rd=request.getRequestDispatcher("/ReadProductServlet");
	Product student =service.getProductbyId(id1);
	if(student!=null)
	out.print("<html>");
	out.print("<head>");
	out.print("<link rel='stylesheet' href='css/EditForm.css'>");

	out.print("</head>");
	out.print("<body>");
    out.print("<div id='customers'>");
	out.print("<form action='UpdateProductServlet' method='get' >");
	out.print("<input type='text' disable name='pid' value="+student.getProductid()+">");
	out.print("<input type='text' name='pname' value="+student.getProductName()+">");
	out.print("<input type='text' name='pdesc' value="+student.getProductDescription()+">");
	out.print("<input type='text' name='price' value="+student.getPrice()+">");
	out.print("<input type='submit' value='UPDATE'>");
	out.print("</form>");
	out.print("</div>");
	out.print("<div class='hero-msg'>");
     
	out.print("<p>  You are on amazon.com.You can also shop on Amazon india for millions of products with fast local delivery. <a href='index.html'>click here to go to amazon.in && back Home page</a></p></div>");
	out.print("</body>");
	out.print("<html>");
	rd.include(request, response);
    
	}

	

}
