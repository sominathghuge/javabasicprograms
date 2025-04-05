package methods;

class destiny{         
	void alpha() {                             //Non static methods
		
		System.out.println("Im a alpha");
	}
	
	void alpha(int a) {                        //Non static methods
		
		System.out.println("Im a beta");
	}
	
    static void alpha(char b) {                //Static methods
		
		System.out.println("Im a gyama");
	}
	
}


public class MethodOverloading {
	
	public static void main(String[] args) {
		
		destiny d=new destiny();                       // create object for non static method
		d.alpha();
		d.alpha(0);
		
		System.out.println("======================");
		
		destiny.alpha('f');                           // Use class name for static method
	
		
	}

}
