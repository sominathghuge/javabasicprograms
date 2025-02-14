package superCallingStatement;

//Super calling statement:
//super keyword is used to refer to the parent class(SuperClass of the current class.
//it is primarily used in inheritance.

class Sin{
	
	Sin()
	{
		System.out.println("Im using SINE");
	}
	Sin(int a)
	{
		System.out.println("Im a using SINE with parameter");
	}
}
class Cos extends Sin{
	
	Cos()
	{
		super(43);
		System.out.println("Im using COS");
	}
	Cos(String a, double b)
	{
		System.out.println("Im using Cos with parameterized");
	}
}
public class SuperCalling3 {
	
	public static void main(String[] args) {
		
//		Sin s=new Sin();
//		Sin r=new Sin(8);
		
		new Cos();
		new Cos("Somi", 0.02);
		
	}

}
