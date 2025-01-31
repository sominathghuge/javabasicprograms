package javaAssignments;
import java.util.IdentityHashMap;
import java.util.Map;

//Assignment 59:Write a program to iterate Map interface using for each loop for Values.
public class Assignment59_LoopforValues {
	
	public static void main(String[] args) {
		
		Map <String, Character>a=new IdentityHashMap<String, Character>();
		
		a.put("Karan", 'A');
		a.put("Rakesh", 'B');
		a.put("Sapna", 'C');
		a.put("Sachin", 'D');
//		a.put('E', "Ramesh");
//		a.put('F', "Jacklin");
		
		System.out.println(a);
		
		
		System.out.println("==========Map Values===========");
		for(Character a1: a.values())
		{
			System.out.println(a1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
