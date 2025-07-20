package org.Override;

public class Axis extends BankDetails{

		public void deposit(String a, int b, float c) {
		System.out.println("Bank Name : "+a);
		System.out.println("Deposit amount : " + b);
		System.out.println("Rate of Interest : " +c);
		System.out.println("\n Old Data ---------------");
		System.out.println("\nOld Savings");
		super.savings("SBI", 50000, 12.10f);
		System.out.println("\n Old Fixed");
		super.fixed("SBI", 50000, 15.2);
		 
		}
		public static void main(String[] args) {
			Axis w = new Axis();
			System.out.println("New Deposit");
			w.deposit("Axis", 800000, 15.2f);
			
		}
}

