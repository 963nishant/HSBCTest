package com.demo.JerseyRestAPI;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Products {
	
	private String category;
	
	private String company;
	
	private String product;
	
	private String color;
	
	private String description;
	
	private int price;
	
	private int discount;
	
	private int no_of_items_in_stock;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getNo_of_items_in_stock() {
		return no_of_items_in_stock;
	}

	public void setNo_of_items_in_stock(int no_of_items_in_stock) {
		this.no_of_items_in_stock = no_of_items_in_stock;
	}

}
