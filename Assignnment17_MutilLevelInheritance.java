package javaAssignments;

//"Assignment 17: Write a program that demonstrates MultiLevel Inheritance using 3 Staticand 2 Non static methods"
class A{                      
	
	static void Test1()         //Static method
	{
		System.out.println("This is Test1");
	}
	
	static void Test2()        //Static method
	{
		System.out.println("This is Test2");
	}
}
class B extends A{            
	
	static void Test3()        //Static method
	{
		System.out.println("This is Test3");
	}
}

class C extends B{          
	
	void Test4()            //Non-Static method
	{
		System.out.println("This is Test4");
	}
	
	void Test5()           //Non-Static method
	{
		System.out.println("This is Test5");
	}
}

class D extends C{
	
	void Test6()          //Non-Static method
	{
		System.out.println("This is Test6");
	}
}
public class Assignnment17_MutilLevelInheritance {

	public static void main(String[] args) {
		
		//For Static methods
        D.Test1();          //from class A
		D.Test2();          //from class A
	    D.Test3();          //from class B
		
	    
	    //For Non-Static methods
		D d=new D(); 
		d.Test4();          //from class C
		d.Test5();          //from class C
		d.Test6();          //from class D
		
		
		
		
	}
}
