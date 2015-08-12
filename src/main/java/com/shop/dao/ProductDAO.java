package com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.Product;

@Repository("productRepository")
public interface ProductDAO extends JpaRepository<Product, Long>{

}
