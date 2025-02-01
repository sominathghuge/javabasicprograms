package inheritance;

//Multilevel inheritance (Minimum 3 classes)
class Shine{
	
	void test1()
	{
		System.out.println("This a parent class 1");
	}
}

class Passion extends Shine{
	
	void test2()
	{
		System.out.println("This a parent class 2");
	}
}

class Platina extends Passion{
	
	void test3()
		{
			System.out.println("This a parent class 3");
		}	
}

class Avenger extends Platina{
	
	void test4() 
	{
		System.out.println("This is a subclass");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		
		Avenger a=new Avenger();
		a.test4();
		a.test3();
		a.test2();
		a.test1();
		
			
		
		
	}

}
