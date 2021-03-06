package com.shop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private SubcategoryService subcategoryService;


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
		if (action.equals("add")) {

			Product product = new Product();
			product = productService.get(idProduct);
			productService.addProductInList(product);

			return product;

		} else if (action.equals("delete")) {
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

	@RequestMapping(value = "/someproducts", method = RequestMethod.GET)
	public List<Product> findSomeProducts() {

		return productService.findSomeProducts(new Long(2));

	}

}
