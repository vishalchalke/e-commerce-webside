package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Product;
import com.service.ProductServiceImple;

/**
 * Servlet implementation class GetProductServlet
 */
@WebServlet("/GetProductServlet")
public class GetProductServlet extends HttpServlet {
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
	out.print("<form action='ProductSessionAddCart' method='get' >");
	out.print("<input type='text' disable name='id' value="+student.getProductid()+">");
	out.print("<input type='text' name='name' value="+student.getProductName()+">");
	out.print("<input type='text' name='desc' value="+student.getProductDescription()+">");
	out.print("<input type='text' name='price' value="+student.getPrice()+">");
	out.print("<input type='submit' value='Add cart'>");
	out.print("</form>");
	out.print("</div>");
	out.print("<div class='hero-msg'>");

	       	
    }
	    
	

}
