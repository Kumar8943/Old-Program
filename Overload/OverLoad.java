package org.Overload;

public class OverLoad {
	private void empDetails(int a, String b, long c, double d) {
		System.out.println("Emp.No : " +a);
		System.out.println("Emp.Name : " +b);
		System.out.println("Emp.Ph.no : " +c);
		System.out.println("Emp.Rating : " +d);
	}
	private void empInfo(int e, char f) {
		System.out.println("Emp.Rank : " +e);
		System.out.println("Emp Initial : " +f);

	}
	public static void main(String[] args) {
		OverLoad o = new OverLoad();
		System.out.println("Employee Details - 1");
		o.empDetails(545, "Kumar", 987654321, 88.95);
		o.empInfo(5,'A');
		System.out.println("------------------------------");
		System.out.println("Employee Details - 2");
		o.empDetails(546, "Ram", 123456789, 75.85);
		o.empInfo(9, 'G');
		
		
	}
}
