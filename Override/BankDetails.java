package org.Override;

public class BankDetails{
	public void savings(String a, int b, float c) {
		System.out.println("Bank Name : "+a);
		System.out.println("Amount : " + b);
		System.out.println("Rate of Interest : " +c);
	}
	public void fixed(String a, int b, double c) {
		System.out.println("Bank Name : "+a);
		System.out.println("Amount : " + b);
		System.out.println("Rate of Interest : " +c);
	}
	public void deposit(String a, int b, float c) {
		System.out.println("Bank Name : "+a);
		System.out.println("Amount : " + b);
		System.out.println("Rate of Interest : " +c);
	}
	
	public static void main(String[] args) {
		BankDetails z = new BankDetails();
		System.out.println("Savings");
		z.savings("SBI", 50000, 12.10f);
		System.out.println("Fixed");
		z.fixed("SBI", 50000, 15.2);
		System.out.println("Deposit");
		z.deposit("SBI", 50000, 13.5f);
		
	}
	}
