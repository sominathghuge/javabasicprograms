package javaAssignments;

//"Assignment 23:Write a program to demonstrate 'Abstraction' using abstract class 'Staff', which consists of 2 abstract methods and 2 concrete methods.

abstract class Staff{              //Abstract Class
	
	abstract void subjects();     //Abstract method
	abstract void marks();        //Abstract method
	void test()                   //Concrete method
	{
		System.out.println("First test will conduct on 12th Des");
	}
	
	void result()                 //Concrete method
	{
		System.out.println("The result declared will be on 2nd janevary");
	}
}

class Hotel extends Staff{
	
	void scholar()
	{
		System.out.println("Tushar is a scholar guy");
	}
	void subjects()        //Give body to abstract method
	{
		System.out.println("In 5th standard having total 8 subject");
	}
	void marks()          //Give body to abstract method
	{
		System.out.println("The passing createria is marks should grater than 40 out of 100);");
	}
}
public class Assignment23_Abstraction {

	public static void main(String[] args) {
		
		Hotel t=new Hotel();
		t.scholar();
		t.subjects();
		t.marks();
		t.test();
		t.result();
		
		
		
		
	}
}
