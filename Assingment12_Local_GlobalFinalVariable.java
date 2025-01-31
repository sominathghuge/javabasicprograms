package javaAssignments;

public class Assingment12_Local_GlobalFinalVariable {
	
    //Assignment 12: Write a program to show the usage of Local, Global and Final variables.

	
	//Global variable:
	int a=444;          //Any variable declared inside the class and outside any method.
	int b=300;
	int c=a-b;
	
	//Local Variable:
	void add()
	{
		int a=43;         //Any variable declared inside the any method.
		int b=22;
		int c=a+b;
		System.out.println(c);
	}
	
	void sub()
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Assingment12_Local_GlobalFinalVariable obj=new Assingment12_Local_GlobalFinalVariable();
		
		obj.add();
		obj.sub();
		
		
	}	
	
}
