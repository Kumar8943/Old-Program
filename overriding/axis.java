package org.overriding;

public class axis extends Rbi
{
	public void cureent() 
	{
	System.out.println("current : 12%");	
	}
	@Override
	public void savings()
{
	System.out.println("savings: 9%");
}
	@Override
public void deposit()
{
	System.out.println("deposit: 10%");
}
    public static void main(String[] args) {
		axis a = new axis();
		a.savings();
		a.deposit();
		a.cureent();
	}

} 
