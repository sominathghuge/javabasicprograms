package inheritance;

//Single level inheritance for Non-static methods (Minimum 2 classes)

class Alpha{
	int a=5;
	int b=4;
	int c=a+b;
	void test1()
	{
		System.out.println("This is a parent class");
	}
}

class Beta extends Alpha{
	
	void test2()
	{
		System.out.println("This is child class");
	}
}

public class SingleLevel {

	public static void main(String[] args) {
		
		Beta b=new Beta();
		b.test2();
		b.test1();
		System.out.println(b.c);
		
	}
	
}





