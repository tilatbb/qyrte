package com.shop.service;

import java.util.List;

import com.shop.model.Product;

public interface ProductService {

	Product save(Product product);
	
	List<Product> findAllProducts();
	
	Product get(Long id);
	
<<<<<<< HEAD
	void addProductInList (Product product);
	
	List<Product> showProductList();
	
	void clearProductList();
	
	void deleteProduct(Long idProduct);
=======
	List<Product> findSomeProducts(Long subcategoryId);
	

	
>>>>>>> 0dd667c3c32f80835d579f47bd7eb41bdcde21e8
}
