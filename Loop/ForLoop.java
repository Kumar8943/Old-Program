package org.Loop;

public class ForLoop {
public static void main(String[] args) {
//	System.out.println("For loop");
	
	//for (int i=1; i<=5; i++)
//	{
//		for(int j=1; j<=6; j++)
	//	{
		//	System.out.print(i);
//	}
	//	System.out.println();
//		System.out.println("Enhanced For loop");
//  }

  // Break & Continue statement
	for (int i = 1; i <=10; i++) {
		if (i==5) {
			break;
			//continue;
		}
		System.out.print(i);
		for(int j=1; j<=6; j++)
		{
			System.out.println();
	}
		
	}
}
}