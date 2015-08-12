package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.dao.CategoryDAO;
import com.shop.model.Category;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDAO categoryRepository;
	
	@Transactional
	public Category save(Category category) {
		category =  categoryRepository.save(category);
				
		return category;

		
	}
	
	public Category get(Long id){
		
		
		Category category = categoryRepository.findOne(id);
		
		return category;
		
	}
	

	public List<Category> findAllCategories() {
		return categoryRepository.findAll();
	}

}
