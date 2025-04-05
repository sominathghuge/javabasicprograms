package methods;

class test{                                 //Superclass
	void alpha() {
		
		System.out.println("Im a alpha");
	}
}

class demo extends test{                   //Subclass
	void alpha() {
		
		System.out.println("Im a beta");
	}
}

public class MethodRidding {
	
	public static void main(String[] args) {
		
		demo d= new demo();
		d.alpha();
		
	}
}
