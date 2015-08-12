package com.shop.service;

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
	
	public List<Product> findSomeProducts(Long subcategoryId){
		
		return productRepository.findSomeProducts(subcategoryId);
	}
	

}
