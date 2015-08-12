package com.shop.service;

import java.util.List;

import com.shop.model.Product;
import com.shop.model.ProductReport;

public interface ProductService {

	Product save(Product product);
	
	List<Product> findAllProducts();
	
	Product get(Long id);
	
	List<ProductReport> findSomeProducts();
}
