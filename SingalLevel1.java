package inheritance;

//Single level inheritance for Static methods(Minimum 2 classes)

class Younger{
	
	static void girl()
	{
		System.out.println("She is so cuteepy.");
	}
}

class Older extends Younger{
	
	static void boy()
	{
		System.out.println("He is so smart.");
	}
}

public class SingalLevel1 {

	public static void main(String[] args) {
		
		Older.girl();
		Older.boy();
		
	}
}
