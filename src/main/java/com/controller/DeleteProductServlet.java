package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ProductServiceImple;


@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	
	ProductServiceImple service=new ProductServiceImple();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	 String id1=request.getParameter("id");
     RequestDispatcher rd=request.getRequestDispatcher("/ReadProductServlet");
	 int id2=Integer.parseInt(id1);
	
	 
	 if(service.deleteProduct(id2)>0) {
		 out.print("<h1> PRODUCT WAS DELETED </h1>");
		 rd.include(request, response);
	 }else {
		 out.print("<h2> PRODUCT WAS NOT DELETED </h1>");
		 rd.include(request, response);
	 }
	}

}
