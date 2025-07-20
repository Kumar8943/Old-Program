package originalsample;

public class SumOfNumbers {

	static  public void  main(String[] args) {
		// "Pr6373e84m"
		
		String s= "Pr6373e84m";
		
		
		System.out.println(getValue(s));
        
	}
	
	public static int getValue(String input) {
              int sum = 0;
		
		for(int i=0; i<input.length(); i++)
		{
			if(Character.isDigit(input.charAt(i))) {
				sum =sum + Integer.parseInt(String.valueOf( input.charAt(i)));
								
			}
		}
		
		return sum;
	}

}
