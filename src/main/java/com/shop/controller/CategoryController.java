package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shop.model.Category;
import com.shop.service.CategoryService;

@RestController
@SessionAttributes("category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/addCategory")
	public Category addCategory(@RequestParam("name") String name) {	
		Category category = new Category();
		category.setName(name);
		categoryService.save(category);
		return category;
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public List<Category> findAllCategories(Model model) {
		return categoryService.findAllCategories();
	}
	
	
}
