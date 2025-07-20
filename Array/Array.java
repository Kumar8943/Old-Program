package org.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Array {

	public static void main(String[] args) {

	    System.out.println("*******Declare  Array****** ");
		// declare a Array
		int a[] = { 10,20,30,40,50,60};
		
		for (int i : a) {
			System.out.println(i);
		}
				
     System.out.println("******* Declare List****** ");
    	List<int[]> asList = Arrays.asList(a);
    	System.out.println(asList);
    	
       	List li = new ArrayList();
     	li.add(100);
     	li.add(200);
      
     	System.out.println(li);
    
     	
		
	}

}
