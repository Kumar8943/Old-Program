package org.Scanner;
import java.util.Scanner;

public class ScannerAverage {
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Mark 1 : ");
		int i = data.nextInt();
		System.out.println("Mark 2 : ");
		int i1 = data.nextInt();
		
		
		System.out.println("Average : " + i + i1);
	}

}
