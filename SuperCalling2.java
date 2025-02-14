package superCallingStatement;

class Truck{
	
	Truck()
	{
		System.out.println("This Constructor from Truck class");
	}
	
	Truck (int a, int b)
	{
		System.out.println("This is parameterized Constructor from Truck class");
	}
	void alpha()
	{
		System.out.println("I have a Truck vehical liecence.");
	}
}

class Car extends Truck{
	
	Car()
	{
	    super(3,5);
		System.out.println("This Contructor from Car class");
	}
	
	Car(String a, float b)
	{
		System.out.println("This Constructor from WITH parameterized");
	}
	
	void beeta() 
	{
		System.out.println("I have Car vehical liencence.");
	}
}
public class SuperCalling2 {
	
	public static void main(String[] args) {
		
		Car c=new Car();   
		c.alpha();
		c.beeta();
		
		//without using this keyword constructor calling.
		//Car r=new Car("Test", 0.05f);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
