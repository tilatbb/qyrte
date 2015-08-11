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

import com.shop.model.Product;
import com.shop.model.Subcategory;
import com.shop.service.ProductService;
import com.shop.service.SubcategoryService;

@Controller
@SessionAttributes(types = Product.class)
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private SubcategoryService subcategoryService;
	
	@RequestMapping(value="addProduct", method=RequestMethod.GET)
	public String addProduct(Model model, HttpSession session){
		
		Subcategory subcategory = new Subcategory();
		subcategory.setName("");
		model.addAttribute("subcategory", subcategory);
		
		Product product = new Product();
		model.addAttribute("product", product);
		
		return "addProduct";	
	}
	
	@RequestMapping(value = "addProduct", method = RequestMethod.POST)
	public String updateCategory(@Valid @ModelAttribute("subcategory") Subcategory subcategory, @ModelAttribute("product") Product product,
			HttpSession session, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		if(result.hasErrors()) {
			return "addProduct";
		}
		else{
			subcategory = subcategoryService.get(product.getSubcategoryId());
			product.setSubcategory(subcategory);
	
			System.out.println("Produsul a fost adaugat la subcategorya : "+subcategory.getName());		
			productService.save(product);
			

		}
		
		return "redirect:addProduct.html";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
}
