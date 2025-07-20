package org.Inteface;

public class Desktop implements Software {

	public void desktopModel() {
		System.out.println("Dell" );
	}
	
	@Override
	public void hardwareResource() {
		System.out.println("RAM : 32 GB");
	}

	@Override
	public void softwareResources() {
		System.out.println("Drawing : Paint Brush");
			}
	public static void main(String[] args) {
	 Desktop a = new Desktop();
	 a.desktopModel();
	 a.hardwareResource();
	 a.softwareResources();
	}
}
