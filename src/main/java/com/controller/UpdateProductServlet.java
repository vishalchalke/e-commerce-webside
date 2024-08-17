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

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ProductServiceImple service=new ProductServiceImple();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("pid");
		String name=request.getParameter("pname");
		String des=request.getParameter("pdesc");
		String marks=request.getParameter("price");
		int id1=Integer.parseInt(id);
		double pri=Double.parseDouble(marks);

		Product student=new Product(id1,name,des,pri);
		RequestDispatcher rd=request.getRequestDispatcher("/ReadProductServlet");

		if(service.modifyProduct(student)>0) {
		
			out.print("PRODUCT UPDATED ");
			rd.include(request, response);
		}else {
			out.print("<h1>PRODUCT NOT UPDATED</H1>");
		}
			
	}


}
