package com.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shop.model.Product;
import com.shop.model.Subcategory;
import com.shop.service.ProductService;
import com.shop.service.SubcategoryService;

@RestController
@SessionAttributes(types = Product.class)
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private SubcategoryService subcategoryService;

	List<Product> ex1 = new ArrayList<Product>();
	
	@RequestMapping(value = "/addProduct")
	public Product addProduct(@RequestParam("name") String name, @RequestParam("price") float price,
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

	@RequestMapping(value = "/productList")
	public Product productList(@RequestParam("idProduct") Long idProduct, @RequestParam("action") String action) {
		if(action.equals("add")){
			
			Product product = new Product();
			product = productService.get(idProduct);
			System.out.println("id-ul produsului este: "+ product.getId());
			System.out.println("numele produsului este "+ product.getName());
			System.out.println("pretul produsului este: "+ product.getPrice());
			
			productService.addProductInList(product);
			
			
			ex1=productService.showProductList();
			for(int i=0; i<ex1.size();i++){
				
				System.out.println("id-ul produsului este-- "+ex1.get(i).getId());
				System.out.println("numele produsului este-- "+ex1.get(i).getName());
				System.out.println("pretul produsului este:-- "+ex1.get(i).getPrice());
			}
			return product;
			
		}
		else if(action.equals("delete")){
			
			System.out.println("s-a sters");
			productService.deleteProduct(idProduct);
			
		}
		
		return null;
	}
	
	
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
	
	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public List<Product> showProductList() {
		return productService.showProductList();
	}
	
	
}
