package inheritance;

//Multiple inheritance not working in java due to diamond attributy.
class Superclass1
{
	void test1()
	{
		System.out.println("This is superclass1");
	}
}

class Superclass2 extends Object{
	
	void test2()
	{
		System.out.println("This is superclass2");
	}
}

class Subclass extends Superclass1 {  //We can't inherit Superclass 1 & Superclass 2 in SUBCLASS (Due to diamond problem)
	
	void test3()
	{
		System.out.println("This is subclass");
	}
}
public class Mutiple {
	
	public static void main(String[] args) {
		
		Subclass sc=new Subclass();
	    sc.test3();
		sc.test1();		
	
	
	
	}
}	
	


