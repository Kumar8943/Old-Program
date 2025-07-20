package originalsample;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
/*		
		String s = "Prem";
		StringBuffer s1 = new StringBuffer();
		s1.append(s);
		System.out.println(s1.reverse());
*/		
		
	/*//	Scanner sc = new Scanner(System.in);
	//    System.out.println("Enter the Number of Rows :  ");
	 //   int rows = sc.nextInt();
	    for(int row = 1; row <=8; row++)
	    {
	    	for(int col =1; col<= row; col++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	//		sc.close();
	    */
	    
			
		
/*		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number of Rows :  ");
	    int rows = sc.nextInt();
	    for(int row = rows; row >=1; --row)
	    {
	    	for(int col =row; col>=1; --col)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
			sc.close();
	*/	
		
		
/*	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the rows : ");
		//int n = sc.nextInt();
		int row,col,num;
		for(row=0; row<5; row++)
		{
			num = 1;
			for (col=0;col<=row; col++) {
				System.out.print(num+" ");
			     num++;
			}  
			System.out.println();
		}*/
		
/*	int row,col,num;
	for (row=1; row<=6; ++row)
	{
		num=1;
		for (col=1; col<=row;++col) {
			System.out.print(num +" ");
			num++;
	}
		System.out.println();
  }*/
		for(int i=1; i<=8;i++)
		{
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
		}
			System.out.println();
		}
 }	
}
