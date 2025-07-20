package org.singleinheritance;

public class Companydetails1 extends Companydetails
{
	public void compid()
	{
	System.out.println("Comp Id: 987645");
	}
	public void compname()
	{
	System.out.println("Comp name: Greens");
	}
	public static void main(String[] args) {
		
	Companydetails1 c = new Companydetails1();
	c.compid();
	c.compname();
	c.empid();
	c.empemail();
	c.empname();
	c.empmobnum();
	}
}
