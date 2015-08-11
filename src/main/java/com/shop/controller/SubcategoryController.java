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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shop.model.Category;
import com.shop.model.Subcategory;
import com.shop.service.CategoryService;
import com.shop.service.SubcategoryService;

@Controller
@SessionAttributes(types = Subcategory.class)
public class SubcategoryController {

	@Autowired
	private SubcategoryService subcategoryService;	
	
	@Autowired
	private CategoryService categoryService;
	
	
	@RequestMapping(value="addSubcategory", method=RequestMethod.GET)
	public String addSubcategory(Model model, HttpSession session){
		
	
		Category category = new Category();
		category.setName("");
		model.addAttribute("category", category);
		
		Subcategory subcategory = new Subcategory();
		subcategory.setName("");
		
		model.addAttribute("subcategory", subcategory);
		
		return "addSubcategory";	
	}	
	
	
	@RequestMapping(value = "addSubcategory", method = RequestMethod.POST)
	public String updateCategory(@Valid @ModelAttribute("subcategory") Subcategory subcategory, @ModelAttribute("category") Category category,
			HttpSession session, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		if(result.hasErrors()) {
			return "addSubcategory";
		}
		else{
			category = categoryService.get(subcategory.getCategoryId());
			
			subcategory.setCategory(category);
			System.out.println("Categoria la care se adauga subcategoria curenta : "+category.getName());		
			subcategoryService.save(subcategory);
			

		}
		
		return "redirect:addSubcategory.html";
	}
	
	@RequestMapping(value="getSubcategories", method = RequestMethod.GET)
	public String getCategorys(Model model){
		List<Subcategory> subcategories = subcategoryService.findAllSubcategories();
		
		model.addAttribute("subcategories", subcategories);
		
		
		
		return "getSubcategories";
	}
	
	@RequestMapping(value = "/subcategories", method = RequestMethod.GET)
	public @ResponseBody List<Subcategory> findAllSubcategories(Model model) {
		return subcategoryService.findAllSubcategories();
	}
	

}
