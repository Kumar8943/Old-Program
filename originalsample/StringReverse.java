package originalsample;

public class StringReverse {

	public static void main(String[] args) {

		String s = "Prem";
		StringBuffer sb= new StringBuffer();
		sb.append(s);
		System.out.println(sb.reverse());
		
		
		for(int i=10; i>=0; i--)
		{
			System.out.println(i);
			
		}
		
		System.out.println("------------------");
		StringBuffer result=new StringBuffer();
	for(int i=s.length()-1; i>=0; i-- )
	{
	//	result=result+s.charAt(i);
		result.append(s.charAt(i));
	}
	System.out.println(result);
	
	}
	

}



//mutable vs immutable
//String - immutable
//StringBuffer - mutable
/*

String s="abc";
s=s+"xyz";
sop(s)  ---> abcxyz

StringBuffer s = new StringBuffer("abc");
sb.append("xyz");
sop(sb.toString()); --> abcxyz






*/