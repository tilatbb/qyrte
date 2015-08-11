package com.shop.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.dao.SubcategoryDAO;
import com.shop.model.Subcategory;

@Service("subcategoryService")
public class SubcategoryServiceImpl implements SubcategoryService {
	
	@Autowired
	private SubcategoryDAO subcategoryRepository;
	
	@PersistenceContext
	private EntityManager em;
	
//	@Autowired
//	private CategoryService categoryService;
//	
//	public List<Category> findAllCategories(){
//		
//		return categoryService.findAllCategories();
//	}
	
	@Transactional
	public Subcategory save(Subcategory subcategory) {
		
		
		subcategory = subcategoryRepository.save(subcategory);
	  
		
		return subcategory;
		
		
	}

	public List<Subcategory> findAllSubcategories() {
		return subcategoryRepository.findAll();
	}
	
	
	public Subcategory get( Long id ) {
		
		  
		  Subcategory subcategory = subcategoryRepository.findOne(id);
		   
		  return subcategory;
		 }
}
