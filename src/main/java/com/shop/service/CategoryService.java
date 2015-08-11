package com.shop.service;

import java.util.List;

import com.shop.model.Category;

public interface CategoryService {

	Category save(Category category);

	List<Category> findAllCategories();
	
	Category get(Long id);

}
