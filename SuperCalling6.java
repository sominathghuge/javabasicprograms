package superCallingStatement;

class A{
	
	A()
	{
		System.out.println("This is automation testing");
	}
	A(int a)
	{
		System.out.println("This is manual testing");
	}
}

class B extends A{
	
	B()
	{
		super();
		System.out.println("This is performance testing");
	}
	
	B(char b)
	{
		super(5);
		System.out.println("This is security testing");
	}
}

public class SuperCalling6 {
	
	public static void main(String[] args) {
		
		new B();
		new B('f');
	
		
	}
}
