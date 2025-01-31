package javaAssignments;

public class Assignment9_MethodOverloading {
	
	//Assignment 9: Write a program on method overloading non static methods.

	void alpha(int a)
	{
		System.out.println("im a int alpha");
	}
	void alpha(char b)
	{
		System.out.println("im a char type alpha");
	}
	void alpha(double c)
	{
		System.out.println("im a double type alpha");
	}
	void aplha(float d)
	{
		System.out.println("im a float type alpha");
	}
	
	
	public static void main(String[] args) {
		
		//To call Non-static method we need to create object reference.
		Assignment9_MethodOverloading obj=new Assignment9_MethodOverloading();
		obj.alpha(0);
		obj.alpha('y');
		obj.alpha(0.2);
        obj.aplha(0.3f);
	}
}
