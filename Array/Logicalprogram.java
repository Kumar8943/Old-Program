package org.Array;

public class Logicalprogram {
	
	public static void main(String[] args) {
		
		String s = "Java application";
		String o = "";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			o = o+s.charAt(i);
		}
			System.out.println(o);
	}

}
