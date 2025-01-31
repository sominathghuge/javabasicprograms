package javaAssignments;

public class Assignment7_MethodOverloading {
	
	//Assignment 7:Demonstrate the method overloading concept to perform the addition function of different data types input like int,double,string.

	
	void add(int add)
	{
		int a=54;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	
	void add (double add)
	{
		double a=0.05;
		double b=3.2;
		double c=a+b;
		System.out.println(c);
	}
	void add(String add)
	{
		String a="Automation ";
		String b="Testing";
		String c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Assignment7_MethodOverloading obj=new Assignment7_MethodOverloading();
		
		obj.add(0);
		obj.add(0.1);
		obj.add("string");
		
		
		
		
	}
}
