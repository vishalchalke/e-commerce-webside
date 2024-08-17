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
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	
	ProductServiceImple service=new ProductServiceImple();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 String id=request.getParameter("pid");
		 String pname=request.getParameter("pname");
		 String discription=request.getParameter("pdesc");
		 String price=request.getParameter("price");
		 int id1=Integer.parseInt(id);
		 double productprice=Double.parseDouble(price);
		 
		 Product student=new Product(id1,pname,discription,productprice);
		 
		RequestDispatcher rd= request.getRequestDispatcher("/ReadProductServlet");
		 if(service.insertProduct(student)>0) {
		 out.print("<h1 style:color:green;>");
		 out.print("YOUR INFOMATION WAS SUCCESSFULLLY ADDED ");
		 out.print("</h1>");
		 rd.include(request, response);
		 }else {
			 out.print("<h1>");
		   out.print("STUDENT ADD TO FAILED IN DATABASE");
		   out.print("</h1>");
		 }
		
		 
		}
	

}
