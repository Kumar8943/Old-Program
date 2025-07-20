package org.constructor;

import java.util.ArrayList;

public class Constructor {
	/*public String name;
	public Constructor() {
		System.out.println("using constructor");
		name =" 123456";
	}
	public static void main (String[] args )
	{
		Constructor C = new Constructor();
		System.out.println("data :"+C.name);
	}*/
	/*public static void main(String args[]) {
        // initialize ArrayList  
        ArrayList<Integer> al = new ArrayList<Integer>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using Advanced For Loop");   
        // printing ArrayList 
        for (Integer num : al) {         
            System.out.println(num);   
      }  }*/
	// Array list to array
	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<String>();
		as.add("city");
		as.add("boston");
		as.add("NY");
		
		String A[] =  new String[as.size()];
for(int j=0; j<as.size();j++)
{
	A[j] =as.get(j); 
}

for(String k :A)
{
	System.out.println(k);
}
	}
    
}





