package org.Scanner;
import java.util.Scanner;
public class ScannerClass {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter Emp Id : ");
		int i = data.nextInt();
		System.out.println("Enter Emp Name : ");
		String s1 = data.next();
		System.out.println("Enter Emp Email : ");
		String s2 = data.next();
		System.out.println("Enter Emp Phone : ");
		long l = data.nextLong();
		System.out.println("Enter Emp salary : ");
		long l1 = data.nextLong();
		System.out.println("Enter Emp Gender : ");
		char c = data.next().charAt(0);
		System.out.println("Enter Emp City : ");
		String s3 = data.next();
		
		System.out.println("Emp Id : " +i);
		System.out.println("Emp Name : " +s1);
		System.out.println("Emp Email : " +s2);
		System.out.println("Emp Phoneno : " +l);
		System.out.println("Emp Salary : " +l1);
		System.out.println("Emp Gender  : " +c);
		System.out.println("Emp city : " +s3);
	} }
