package com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.model.Category;

@Repository("categoryRepository")
public interface CategoryDAO extends JpaRepository<Category, Long> {

	
	
		
}
