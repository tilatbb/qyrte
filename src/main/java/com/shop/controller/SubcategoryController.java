package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shop.model.Category;
import com.shop.model.Subcategory;
import com.shop.service.CategoryService;
import com.shop.service.SubcategoryService;

@RestController
@SessionAttributes(types = Subcategory.class)
public class SubcategoryController {

	@Autowired
	private SubcategoryService subcategoryService;	
	
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/addSubcategory")
	public Subcategory addSubcategory(@RequestParam("nameSubcategory") String nameSubcategory, @RequestParam("categoryId") Long categoryId) {	
		Category category = new Category();
		Subcategory subcategory = new Subcategory();
		category = categoryService.get(categoryId);
		subcategory.setCategory(category);
		subcategory.setName(nameSubcategory);
		subcategoryService.save(subcategory);
		return subcategory;
	}
	
	@RequestMapping(value = "/subcategories", method = RequestMethod.GET)
	public List<Subcategory> findAllSubcategories(Model model) {
		return subcategoryService.findAllSubcategories();
	}
	

}
