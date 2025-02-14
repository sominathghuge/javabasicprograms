package superCallingStatement;

//Super Keyword:
//super keyword is used to refer the parent class of the current class.
//it is primarily used in inheritance.



class Alpha{
	
	Alpha(int a)                          //Constructor 1
	{
		System.out.println("This is superclass");
	}
	void test1()                         //Method 1
	{
		System.out.println("This is method test1.");
	}
}

class Beeta extends Alpha{
	
	Beeta(String b)                   //Constructor 1
	{
		super(85);
		System.out.println("This is subclass");
	}
	  
	void test2()                      //Method 1
	{
		System.out.println("This is method test2.");
	}
}

public class SuperCalling1 {
	
	public static void main(String[] args) {
		
		Beeta b=new Beeta(null);
        b.test1();
        b.test2();
	    
				
		
		
		
	}
	
	

}
