package javaAssignments;
//"Assignment 20: Write three different programs to explain Hierarchical level inheritance. (where multiple subclasses inherit from a single parent class)"

//Hierarchical Inheritance
class Superclass{                           //Superclass
	
	void truck()
	{
		System.out.println("Truck is 10 wheeler vehical");
	}
	
	void car()
	{
		System.out.println("Car is 4 wheeler vehical");
	}
}	
class Subclass1 extends Superclass{          //Subclass 1
	
	void maxx()
	{
		System.out.println("Maxx also 4 wheelar vehical");
	}
		
}

class Subclass2 extends Superclass{        //Subclass 2
	
	void bike()
	{
		System.out.println("Bike is a 2 wheeler");
	}
}

class Subclass3 extends Superclass{       //Subclass 3
	
	void cycle()
	{
		System.out.println("Cycle is used for going to short distance");
	}	
}
	


public class Assignment20_HierarchicalInheritance {

	public static void main(String[] args) {
		
	  Subclass1 s1=new Subclass1();
	  s1.truck();
	  s1.car();
	  s1.maxx();
	  
	  System.out.println("===========================");
	  
	  Subclass2 s2=new Subclass2();
	  s2.truck();
	  s2.car();
	  s2.bike();
	  
	  System.out.println("===========================");
	  
	  Subclass3 s3=new Subclass3();
	  s3.truck();
	  s3.car();
	  s3.cycle();
		
		
		
	}
}
