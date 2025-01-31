package javaAssignments;

class Test1{
	
	static void alpha()
	{
		System.out.println("This is alpha method of class Test1");
	}
	
	static void gyamma()
	{
		System.out.println("This is gyamma method of class Test1");
	}
}
class Test2 extends Test1{
	
	static void beeta()
	{
		System.out.println("This is beeta method of class Test2");
	}
}
public class Assignment16_SingleLevelInheritance {

	public static void main(String[] args) {
		
		Test2.alpha();
		Test2.gyamma();
		Test2.beeta();
		
		
		
		
	}
}
