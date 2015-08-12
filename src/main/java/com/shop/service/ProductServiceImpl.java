package com.shop.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ProductDAO;
import com.shop.model.Product;
import com.shop.model.ProductReport;

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
	
	public List<ProductReport> findSomeProducts(){
		return productRepository.findSomeProducts();
	}
}
