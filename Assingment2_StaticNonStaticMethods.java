package javaAssignments;

public class Assingment2_StaticNonStaticMethods {

	static void method1()
	{
		System.out.println("This is first static method");
	}
	static void method2()
	{
		System.out.println("This is a second static method");
	}
	static void method3()
	{
		System.out.println("This is a third static method");
	}
	void method4()
	{
		System.out.println("This is fourth non-static method");
	}
	void method5()
	{
		System.out.println("This is fifth non-static method");
	}
	
	
	public static void main(String[] args) {
		
		//Static methods
		Assingment2_StaticNonStaticMethods.method1();
		Assingment2_StaticNonStaticMethods.method2();
		Assingment2_StaticNonStaticMethods.method3();
		
		
		//Non-Statc methods
		Assingment2_StaticNonStaticMethods as=new Assingment2_StaticNonStaticMethods();
		as.method4();
		as.method5();
		
	}
	
	
	
}
