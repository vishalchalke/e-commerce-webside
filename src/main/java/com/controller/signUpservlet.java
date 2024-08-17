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


@WebServlet("/signUpservlet")
public class signUpservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		 String pname=request.getParameter("username");
		 String pass=request.getParameter("pswrepeat");
         
		 ProductServiceImple service=new ProductServiceImple();
		  
		 RequestDispatcher rd=request.getRequestDispatcher("customerLogin.html");
		 Product auth=new Product();
		 auth.setPassword(pass);
		 auth.setUsername(pname);
		 
		 out.print(pass+"  "+pname);
		 out.println(auth);
		 if(service.SignUpPage(auth)>0) {
				
				out.print("SIGN IS SUCCESSFULLY DONE");
				rd.include(request, response);
			}else {
				out.print("<h1>NOT SUCCESSFULL</H1>");
				
			}
      
		
	}

}
