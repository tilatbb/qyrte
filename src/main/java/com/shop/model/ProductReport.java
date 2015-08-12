package com.shop.model;

public class ProductReport {
	
	private String nameProduct;
	private float priceProduct;
	private String subcategoryName;
	
	public ProductReport(String nameProduct, int priceProduct, String subcategoryName){
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.subcategoryName = subcategoryName;
	}
	
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public float getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(int priceProduct) {
		this.priceProduct = priceProduct;
	}
	public String getSubcategoryName() {
		return subcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	
	
}
