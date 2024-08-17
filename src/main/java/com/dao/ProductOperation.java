package com.dao;

import java.util.ArrayList;

import com.model.Product;


public interface ProductOperation {

     int addProduct(Product product);
     
    
     int removeProduct(int id);
     
    
     Product getProduct(int id);
    
    
     int updateProduct(Product product);
    
    
     ArrayList<Product> AllProdct();
     
     int RegisterUser(Product product);
     

}
