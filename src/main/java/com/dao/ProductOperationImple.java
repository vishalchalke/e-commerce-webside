package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.Product;

import com.utility.Utility;

public class ProductOperationImple implements ProductOperation {
 

	@Override
	public int addProduct(Product product) {
		int rows=0;
		Connection con=Utility.getConnection();
		try {
		String sql="insert into bookproduct values(?,?,?,?)";
	    PreparedStatement ps=con.prepareStatement(sql);
	   ps.setInt(1, product.getProductid());
	   ps.setString(2,product.getProductName());
	   ps.setString(3,product.getProductDescription());
	   ps.setDouble(4, product.getPrice());
	    rows=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return rows;
	}

	@Override
	public int removeProduct(int id) {
	
		int rows=0;
		   Connection con =Utility.getConnection();
		   try {
		   String sql="delete from bookproduct where productid=?";
		   PreparedStatement ps=con.prepareStatement(sql);
		   ps.setInt(1, id);
		  rows= ps.executeUpdate();
		   }catch(Exception e) {  
			   e.printStackTrace();
		   }
			return rows;
	}

	@Override
	public Product getProduct(int id) {
		Product student=null;
		Connection con=Utility.getConnection();
		try {
		String sql="Select * from bookproduct where productid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			student=new Product();
			student.setProductid(rs.getInt(1));
			student.setProductName(rs.getString(2));
			student.setProductDescription(rs.getString(3));
			student.setPrice(rs.getDouble(4));
			
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return student;
	
	}

	@Override
	public int updateProduct(Product product) {
		int row=0;
		 Connection con=Utility.getConnection();
		 try {
		 String sql="update bookproduct set productName=?,productDiscription=?,price=? where productid=?";
		 PreparedStatement ps=con.prepareStatement(sql);
		 ps.setString(1,product.getProductName());
		 ps.setString(2, product.getProductDescription());
		 ps.setDouble(3, product.getPrice());
		 ps.setInt(4, product.getProductid());
		 
		row =ps.executeUpdate();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return row;
	}

	@Override
	public ArrayList<Product> AllProdct() {
		ArrayList<Product>list=new ArrayList<Product>();
		
		Connection con=Utility.getConnection();
		try {
			String sql="select *from bookproduct";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
		
		    while(rs.next()) {
				Product student=new Product();

		     student.setProductid(rs.getInt(1));
		     student.setProductName(rs.getString(2));
		     student.setProductDescription(rs.getString(3));
		     student.setPrice(rs.getDouble(4));
		     list.add(student);
		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int RegisterUser(Product product) {
		int rows=0;
		Connection con=Utility.getConnection();
		try {
		String sql="insert into bookproduct values(?,?)";
	    PreparedStatement ps=con.prepareStatement(sql);
	    ps.setString(1,product.getUsername());
	    ps.setString(2,product.getPassword());
	    rows=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
}
