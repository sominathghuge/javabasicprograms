package javaAssignments;

//Assignment 65:Write a program to demonstrate access specifier for class.

class Test
{
	public static void method1()
	{
		System.out.println("Method1");
	}
	private static void method2()
	{
		System.out.println("Method2");
	}
	static void method3()
	{
		System.out.println("Method3");
	}
	protected static void method4()
	{
		System.out.println("Method4");
	}
}

public class Assignment65_AccessSpecifierClass {
	
	public static void main(String[] args) {
		
		Test.method1();
		Test.method3();
		Test.method4();
		
		//Method 2 is not able access due to privare access specifier.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
