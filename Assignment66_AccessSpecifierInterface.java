package javaAssignments;

//Assignment 66: Write a program to demonstrate access specifier for interface.

interface  Run{
	
    public void alpha();
    
    private void beta() 
    {
    	System.out.println("This is Beta");
	}
    default void theeta() 
    {
    	System.out.println("This is Theeta");
    }
    
    //Only public, private, abstract, default, static and strictfp are permitted.
//    final void gyamma()
//    {
//    	
//    }
    
}
class Exam implements Run{            //Implements interface

	 public void alpha()
	 {
		 System.out.println("This is alpha");
	 }
     void pi() 
     {
    	 System.out.println("This is PI");
     }
     
}

public class Assignment66_AccessSpecifierInterface {
	
	public static void main(String[] args) {
		
		Exam t=new Exam();
		t.alpha();
		t.pi();
		t.theeta();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
