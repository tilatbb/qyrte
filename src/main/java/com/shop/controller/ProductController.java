package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "/addProduct")
	public @ResponseBody Product addProduct(@RequestParam("name") String name, @RequestParam("price") float price,
			@RequestParam("description") String description, @RequestParam("url") String url,
			@RequestParam("subcategoryId") Long subcategoryId) {

		Product product = new Product();
		Subcategory subcategory = new Subcategory();
		subcategory = subcategoryService.get(subcategoryId);
		product.setSubcategory(subcategory);
		product.setName(name);
		product.setPrice(price);
		product.setDescription(description);
		product.setUrl(url);
		productService.save(product);
		return product;
	}

	@RequestMapping(value = "/getProduct")
	public @ResponseBody Product getProduct(@RequestParam("idProduct") Long idProduct) {

		Product product = new Product();
		product = productService.get(idProduct);
		System.out.println("id-ul produsului este: "+ product.getId());
		return product;
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
}
