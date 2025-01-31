package javaAssignments;

//Assignment 75:Write a program to demonstrate the usage of ""Final"" keyword in methods, class & variables"

/* NOTE: 
 * 1. When you use final keyword with class then class not able to inherit.
 * 2. When you use final keyword with Variable then Variable is not able update.
 * 3. When you use final keyword with Method then Methods are not able override .

 */

final class Summer{
	 
	final int a=33;
	
	final void alpha()
	{
		System.out.println("Boys are strong");
	}
}

//class Winter extends Summer{
//	
//	void beta(){
//		System.out.println("gdrg");
//	}	
//}

public class Assignment75_FinalKeywordProgram {
	
	public static void main(String[] args) {
		
		Summer s=new Summer();
		
		System.out.println(s.a);
		s.alpha();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
