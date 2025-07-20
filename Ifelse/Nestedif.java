package org.Ifelse;

public class Nestedif {
	public static void main(String[] args) {
		int password = 21;
		if ( password > 20) {
			System.out.println(" correct password 1");
		}
		else if (password >30) {
			System.out.println("correct password 2");
			}
		else if (password > 40) {
			System.out.println("correct password 3");
		}
		else {
			System.out.println("Wrong Password");
		}
	}

}
