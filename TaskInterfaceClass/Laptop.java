package org.TaskInterfaceClass;

public class Laptop implements Mobile{

	public void brand() {
		System.out.println(" DELL");
	}
	@Override
	public void phone() {
		System.out.println("IPHONE");
	}

	@Override
	public void model() {
		System.out.println("13 PROMAX");
	}
	public static void main(String[] args) {
		Laptop a = new Laptop();
		a.brand();
		a.phone();
		a.model();
	}

	
}
