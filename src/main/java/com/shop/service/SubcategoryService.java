package com.shop.service;

import java.util.List;

import com.shop.model.Subcategory;

public interface SubcategoryService {

	Subcategory save(Subcategory subcategory);

	List<Subcategory> findAllSubcategories();
	
	Subcategory get(Long id);
}
