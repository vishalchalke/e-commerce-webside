package com.service;

import java.util.ArrayList;

import com.dao.ProductOperationImple;
import com.model.Product;

public class ProductServiceImple implements ProductService {
	ProductOperationImple operation=new ProductOperationImple();
	public ProductServiceImple() {
		
	}

	@Override
	public int insertProduct(Product product) {
		
		return operation.addProduct(product);
		
	}

	@Override
	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		return operation.removeProduct(id);
	}

	@Override
	public Product getProductbyId(int id) {
		// TODO Auto-generated method stub
		return operation.getProduct(id);
	}

	@Override
	public int modifyProduct(Product product) {
		
		return operation.updateProduct(product);
	}

	@Override
	public ArrayList<Product> showAllProduct() {
		// TODO Auto-generated method stub
		return operation.AllProdct();
	}

	@Override
	public int SignUpPage(Product product) {
		return operation.RegisterUser(product);
	}

	

}
