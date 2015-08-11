package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shop.model.Category;
import com.shop.service.CategoryService;

@Controller
@SessionAttributes("category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	
	
	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public String addCategory(@RequestParam("nameCategory") String nameCategory) {	
		Category category = new Category();
		category.setName(nameCategory);
		System.out.println(nameCategory);
		categoryService.save(category);
		return "redirect:addCategory.html";
	}
	
	@RequestMapping(value="getCategories", method = RequestMethod.GET)
	public String getCategorys(Model model){
		List<Category> categories = categoryService.findAllCategories();
		
		model.addAttribute("categories", categories);
		
		return "getCategories";
	}
	
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public @ResponseBody List<Category> findAllCategories(Model model) {
		
		List<Category> categories = categoryService.findAllCategories();
		
		model.addAttribute("categories", categories);
		
		return categoryService.findAllCategories();
	}
	
	
}
