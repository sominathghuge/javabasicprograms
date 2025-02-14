package superCallingStatement;

class Sign
{
	Sign()
	{
		System.out.println("This is 1st constructor");
	}
	Sign(int a)
	{
		System.out.println("This is 2st constructor");
	}
//	Sign(float b)
//	{
//		System.out.println("This is 3rd constructor");
//	}
	Sign(String c)
	{
		System.out.println("This is 4th constructor");
	}

}
class Logout extends Sign{
	
	Logout()
	{
		super(45);
		System.out.println("This is 5th constructor");
	}
	Logout(double d)
	{
		super("Somi");
		System.out.println("This is 6th constructor");
	}
}


public class SuperCalling8 {
	
	public static void main(String[] args) {
		
	Logout l=new Logout();
    Logout l1=new Logout(.05d);
    
		
		
		
		
		
	}

}
