package com.example.model;

public class Product {
	public int prodId;
	public String name;
	public float price;
	public int quantity;
	public String brand;
	public float deliveryCharges;
	
	public Product(int prodId, String name, float price, int quantity, String brand, float deliveryCharges) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.deliveryCharges = deliveryCharges;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(float deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	
	
}
