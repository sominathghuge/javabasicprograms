package javaAssignments;

//Assignment 73:Write a program to demonstrate ""this"" keyword.

class Details{
	
	private int age;
	
	public Details(int age) 
	{
		this.age=age;
	}
	
	public void info()
	{
	 System.out.println("Age: "+ this.age);	
	}
}

public class Assignment73_thisKeyword {

	public static void main(String[] args) {
		
		Details d=new Details(78);
		d.info();
		
		

		
	}

}
