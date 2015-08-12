package com.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.model.Product;
import com.shop.model.ProductReport;

@Repository("productRepository")
public interface ProductDAO extends JpaRepository<Product, Long>{
	//new com.shop.model.ProductReport(g.name, g.price, "+ "g.description)"+
	
	@Query("from Product g where g.subcategory = 2")
	List<ProductReport> findSomeProducts();
	
}
