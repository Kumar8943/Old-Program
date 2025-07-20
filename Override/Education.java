package org.Override;

public class Education {
	public void ug(String a, String b) {
		System.out.println("\nCourse : " +a + b);
		
	}
	public void pg(String c, String d) {
		System.out.println("Course : " +c + d);

	}

	public static void main(String[] args) {
		Education z = new Education();
		z.ug("\nBbm", " \nBcom");
		z.pg("\nMcom","\nMba");
	}
}
