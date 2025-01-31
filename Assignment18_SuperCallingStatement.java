package javaAssignments;

//"Assignment 18: Write a program on 'super' statement to invoke a parent class constructor from a child class constructor.
//Consider here the Parent class is 'Vehicle'and Child class is 'Car.

class Vehical{                  //Superclass
	
	Vehical()
	{
		System.out.println("This is Constructor First from Superclass");
	}
	
	Vehical(String a)
	{
		System.out.println("This is Constructor Second from Superclass");
	}
	Vehical(char b)
	{
		System.out.println("This is Constructor Third from Superclass");
	}
}

class Car extends Vehical{     //Subclass
	
	Car()
	{
		
		System.out.println("This is Constructor Fourth from Subclass");
	}
	Car(float a)
	{
		super("Somi");
		System.out.println("This is Constructor Fifth from Subclass");
	}
	Car(double b)
	{
		super('f');
		System.out.println("This is Constructor Sixth from Subclass");
	}
}
public class Assignment18_SuperCallingStatement {

	public static void main(String[] args) {
		
//		Car c=new Car();
//		Car c1=new Car(0.05f);
//		Car c2=new Car(0.000087d);
		
		//OR
		
		new Car();
		new Car(0.05f);
		new Car(0.000087d);
	}
}
