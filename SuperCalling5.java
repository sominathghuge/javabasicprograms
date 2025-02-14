package superCallingStatement;

class Testing{
	
	Testing()                          //Constructor1
	{
		System.out.println("First Constructor of Testing class");
    }
	Testing(String a)                  //Constructor2
	{
		System.out.println("Second Constructor of Testing class");
	}
	Testing(int a, char b, float c)     //Constructor3
	{
		System.out.println("Third Constructor of Testing class");
	}
	void test1()                       //Method
	{
		System.out.println("First Method of Constructor of Testing class");
	}
}

class Dev extends Testing{
	
	Dev()                             //Constructor 1
	{
		super();
		System.out.println("First Constructor of Dev class.");
	}
	Dev(int a)                       //Constructor 2 	
	{
		super(3, 'r', 0.03f);
		System.out.println("Second Constructor of Dev class");
	}
}

public class SuperCalling5 {

	public static void main(String[] args) {
		
		new Dev();
		new Dev(8);
		
		Testing t=new Testing("Test");
		t.test1();
	
	
	}
}


	


