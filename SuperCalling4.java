package superCallingStatement;

class Test1{
	
	Test1()
	{
		
		System.out.println("Automation testing");
	}
	Test1(int a)
	{
		System.out.println("Performance Testing");
	}
	Test1(char a)
	{
		System.out.println("Security Testing");
	}
	Test1(float b)
	{
		System.out.println("Cross borwser testing");
	}
	
}

class Test2 extends Test1{
	
	Test2()
	{
		System.out.println("Manual testing");
	}
	Test2(int a)
	{
		super(5);
		System.out.println("beeta testing");
	}
	
	Test2(char b)
	{
		super('t');
		System.out.println("Regression testing");
	}
	Test2(String c)
	{
		super(0.05f);
		System.out.println("Sanity testing");
	}	
	
}

public class SuperCalling4 {
	
	public static void main(String[] args) {
		
		new Test2();
		new Test2(5);
		new Test2('e');
		new Test2("Testing");
		
		
	}

}
