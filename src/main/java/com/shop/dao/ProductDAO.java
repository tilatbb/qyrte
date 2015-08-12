package com.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shop.model.Product;

@Repository("productRepository")
public interface ProductDAO extends JpaRepository<Product, Long>{
	//new com.shop.model.ProductReport(g.name, g.price, "+ "g.description)"+
	
	@Query("from Product p where p.subcategory.category.id = :subcategoryId and p.price > 2000"
			+ " and p.price < 3000")
    List<Product> findSomeProducts(@Param("subcategoryId") Long subcategoryId);
	
	
	
	
}
