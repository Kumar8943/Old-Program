package org.Override;

public class Arts extends Education{
	public void bsc(String e) {
		System.out.println("Department : "+e);
	}
	public void bEd(String f) {
		System.out.println("\nDepartment : "+f);
	}
	public void ba(String g) {
		System.out.println("\nDepartment : "+g);
		super.ug("\nBca", "\nBcs");
	}
	
	public static void main(String[] args) {
		Arts u = new Arts();
		u.bsc("\nComputer Science");
		u.bEd("\nTamil");
		u.ba("\nEnglish");
							
				
	}
}
