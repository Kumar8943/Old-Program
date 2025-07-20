package org.interfacee;

import org.interfacee.Test.AxisBank;
import org.interfacee.Test.Bank;
import org.interfacee.Test.Demo;
import org.interfacee.Test.Myinterface;

public class Test1 {
/*	public static class AxisBank implements Bank
	{
	public void savings()
	{
		System.out.println("saving regular");
	}
	public void current()
	{
		System.out.println("current");
	}
	public void salary()
	{
		System.out.println("salary");
	}
	public void joint()
	{
		System.out.println("joint");
	}
	public void branchDetails()
	{
		System.out.println("chennai");
	}
	public static void main(String[] args)
	{
	AxisBank info = new AxisBank();
	info.branchDetails();
	info.savings();
	info.salary();
	}
	}*/
public class demo implements Myinterface
{
	  public void method1()
	  {
		System.out.println("123456");
	}
	  public void method2()
	  {
		  System.out.println("Hello");
	}

public static void main(String[] args) {
	
	  Myinterface obj = new demo();
	  obj.method1();
	  obj.method2();
}}