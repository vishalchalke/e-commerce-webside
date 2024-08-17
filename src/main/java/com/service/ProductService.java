package com.service;

import java.util.ArrayList;

import com.model.Product;


public interface ProductService {
	
     int insertProduct(Product product);
    
     int deleteProduct(int id);
    
     Product getProductbyId(int id);
    
     int modifyProduct(Product product);
    
     ArrayList<Product> showAllProduct();
     
     int SignUpPage(Product product);
     
    

}
