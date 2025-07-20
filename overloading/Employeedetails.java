package org.overloading;

public class Employeedetails
{
public void empinfo()
{
System.out.println("Employee Info");
}	
public void empinfo(int id)
{
System.out.println("Employee Id is"+id);
}
public void empinfo(String name) 
{
System.out.println("Employee name is"+name);
}
public void empinfo(String email, long mobnum)
{
System.out.println("Employee Email:"+email);
System.out.println("Employee mobnum :"+mobnum);
}
public static void main(String[] args) {
Employeedetails e = new Employeedetails();
e.empinfo();
e.empinfo(5241);
e.empinfo("Arun");
e.empinfo("kumar@gmail.com",987654321);

}
}
	

