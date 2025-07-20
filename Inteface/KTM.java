package org.Inteface;

public class KTM implements Bike{

	@Override
	public void cost(long w) {
		System.out.println("Bike Cost : Rs - " + w);
	}

	@Override
	public void speed(int q) {
		System.out.println("Bike Speed : " + q);
	}
	
	public static void main(String[] args) {
		KTM a = new KTM();
		a.cost(225000);
		a.speed(180);
	}

}
