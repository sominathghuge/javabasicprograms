package javaAssignments;

//"Assignment 24: Write a program that demonstrate 'interface' concept."


interface Boy{          //Interface1
	
	void smart();
	void verySmart();
	void strong();
}
interface Girl{         //Interface2
	
	void cutiee();
}

class Other implements Boy, Girl{    //Concrete class

	public void cutiee() 
	{
		System.out.println("The little baby was very cute");
	}

	public void smart() {
		
		System.out.println("The baby boy is so smart");
		
	}

	public void verySmart() {
		
		System.out.println("Boys and girls both are very smart in this class");
		
	}

	public void strong() {
		
		System.out.println("Boys are physically strong compare to girls");
		
	}
		
}

public class Assignment24_InterfaceProgram {

	public static void main(String[] args) {
		
		Other t=new Other();
		t.cutiee();
		t.smart();
		t.verySmart();
		t.strong();
		
				
	}
}
