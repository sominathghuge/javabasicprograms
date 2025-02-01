package inheritance;


//Hierarchical inheritance (1 parent 2 child)
class Parent{
	
	void test1()
	{
		System.out.println("Im a father of 2 born baby");
	}
}

class Child1 extends Parent{
	
	void test2()
	{
		System.out.println("This first born baby");
	}
}

class Child2 extends Parent{
	
	void test3()
	{
		System.out.println("This is second born baby");
	}
}
public class Hierarchical {
	
	public static void main(String[] args) {
		
		Child1 c=new Child1();
		c.test1();
		c.test2();
		
		Child2 c2=new Child2();
		c2.test1();
		c2.test3();
		
	}

}
