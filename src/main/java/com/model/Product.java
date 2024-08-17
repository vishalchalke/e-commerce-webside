package com.model;

public class Product {
	private int productid;
	private String ProductName;
	private String productDescription;
	private double price;
	private String username;
	private String password;
	public Product() {
		super();
	}
	
	public Product(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Product(int productid, String productName, String productDescription, double price) {
		super();
		this.productid = productid;
		ProductName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", ProductName=" + ProductName + ", productDescription="
				+ productDescription + ", price=" + price + ", username=" + username + ", password=" + password + "]";
	}

}
