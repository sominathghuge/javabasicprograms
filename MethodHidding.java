package methods;


class superclass{                                //Superclass
	static void alpha() {
		
		System.out.println("Im a superclass");
	}
}


class subclass extends superclass{               //Subclass(Inheritance takes place)
	static void alpha() {
		
		System.out.println("Im a subclass");
	}
}
public class MethodHidding {
	
	public static void main(String[] args) {
		
		subclass.alpha();
		
	}
	
}
