package javaAssignments;

//Assignment 76:Write a program to demostrate the concept of compile time polymorphism.

//Concept of compile time polymorphism
class Family{
	
	void Test()
	{
		System.out.println("There are 5 family member");
	}
	void Test(int a)
	{
		System.out.println("In this familiy lives both father and mother");
	}
	void Test(int a, int b)
	{
		System.out.println("One Brother");
	}
	void Test(int a, double b)
	{
		System.out.println("One Sister");
	}
	
	void Test(double b, int a)
	{
		System.out.println("Happy family");
	}

}
public class Assignment76_Polymorphism {
	
	public static void main(String[] args) {
		
		Family v = new Family();
		v.Test();
		v.Test(0);
		v.Test(0, 0);
		v.Test(0, 0.0);
		v.Test(0.0, 0);
		
		
		
		
		
		
		
			
	}
	
	

}
