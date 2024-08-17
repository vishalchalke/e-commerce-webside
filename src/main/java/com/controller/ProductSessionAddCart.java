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


@WebServlet("/ProductSessionAddCart")
public class ProductSessionAddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String des=request.getParameter("desc");
		String pric=request.getParameter("price");
		
		int id1=Integer.parseInt(id);
		double price=Double.parseDouble(pric);
		Product p1=new Product(id1,name,des,price);
		
		ArrayList<Product>friend=new ArrayList<Product>();
         friend.add(p1);
         
         session.setAttribute("ckid", friend);
         
       out.print("PRODUCT IS BOOKED SUCCESSFULLY <br>");
       request.getRequestDispatcher("NewIndex.jsp").forward(request, response);
	}

}
