package com.iiht.feign.service.productservice;

import java.util.List;

import com.iiht.feign.service.model.Product;

public interface ProductService {
	
	List<Product> findAll();
	List<Product> findByCategory(String category);
	Product findById(int id);

}
