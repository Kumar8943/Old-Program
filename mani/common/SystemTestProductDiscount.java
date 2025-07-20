package com.mani.common;

import java.util.ArrayList;
import java.util.List;

public class SystemTestProductDiscount {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		Product p = new Product("P1", 20, "Y");
		productList.add(p);
		
		p = new Product("P2", 50, "N");
		productList.add(p);
		
		productList.add(new Product("P3", 40, "Y"));
		productList.add(new Product("P4", 30, "Y"));
		productList.add(new Product("P5", 70, "N"));
		productList.add(new Product("P6", 100, "N"));
		productList.add(new Product("P7", 120, "N"));
		productList.add(new Product("P8", 25, "N"));
		productList.add(new Product("P9", 85, "N"));
		productList.add(new Product("P10", 75, "N"));


		calculate(productList);
	}

	public static void calculate(List<Product> productList) {

		for(Product p: productList) {
			if(p.getIsDiscountEligible().equals("Y")) {
				p.setPrice((float)(p.getPrice() * 0.50));
			}
		}

		System.out.println("Discount price got updated into respective product: \n\n" + productList);
	}

}

class Product {
	private String name;
	private float price;
	private String isDiscountEligible;
	
	public Product(String name, float price, String isDiscountEligible) {
		this.name = name;
		this.price = price;
		this.isDiscountEligible = isDiscountEligible;
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

	public String getIsDiscountEligible() {
		return isDiscountEligible;
	}

	public void setIsDiscountEligible(String isDiscountEligible) {
		this.isDiscountEligible = isDiscountEligible;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", isDiscountEligible=" + isDiscountEligible + "]";
	}
	
	
}
