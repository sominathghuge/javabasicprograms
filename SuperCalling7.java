package superCallingStatement;

class bigger{
	
	bigger(double a, int b)
	{
		System.out.println("This is 1 method");
	}
	
	bigger(int a, double b)
	{
		System.out.println("This is 2 method");
	}
	
}
class smaller extends bigger{
	
	smaller(double d)
	{
		super(2.3, 5);
		System.out.println("This is 3 method");
	}
	
	smaller(float a) 
	{
		super(3, 9.8);
		System.out.println("This is 4 method");
	}
}
public class SuperCalling7 {
	public static void main(String[] args) {
		
		smaller s=new smaller(2.58d);	
		smaller s1=new smaller(0.07f);
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
