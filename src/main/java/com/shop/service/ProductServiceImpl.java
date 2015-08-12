package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ProductDAO;
import com.shop.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productRepository;

	public Product save(Product product) {
		product = productRepository.save(product);
		
		return product;
	}

	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	public Product get(Long id) {
		Product product = productRepository.findOne(id);
		
		return product;
	}
	
<<<<<<< HEAD
	List<Product> productList = new ArrayList<Product>();
	
	public void addProductInList (Product product){
		
		productList.add(product);
	}
	
	public List<Product> showProductList(){
		
		return productList;
	}
	
	public void clearProductList(){
		
	productList.clear();
	}
	
	public void deleteProduct(Long idProduct){
		
		int id= idProduct.intValue();
		productList.remove(id);
	}
	
	
	
	
	
	
=======
	public List<Product> findSomeProducts(Long subcategoryId){
		
		return productRepository.findSomeProducts(subcategoryId);
	}
	
>>>>>>> 0dd667c3c32f80835d579f47bd7eb41bdcde21e8

}
