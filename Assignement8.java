package javaAssignments;

public class Assignement8 {
	
	//Assignment 8: Write a program on method overloading static methods.
	
		public static void test(int a)
		{
			System.out.println("This is a int datatype test");
		}
		
		public static void test(double b)
		{
			System.out.println("This is a double datatype test");
		}
		
		public static void test(String c)
		{
			System.out.println("This is a string data type test");
		}
		
		
		public static void main(String[] args) {
			
		//To call static method we don't need to create object reference.
			
			Assignement8.test(0);
			Assignement8.test(0.2);
			Assignement8.test("Somi");
			
			System.out.println("End");
		}

	
}
