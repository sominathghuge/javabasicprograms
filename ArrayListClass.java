package collectionFramework;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		//Collection 1
		ArrayList a1=new ArrayList();
		
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("Balu");
		a1.add("Chiu");
		
		System.out.println(a1);
		
		//Collection 2
		ArrayList a2=new ArrayList();
		
		a2.add(56);
		a2.add(57);
		a2.add(58);
		a2.add(60);
		
		System.out.println(a2);
		
		
		//Collection  3
		ArrayList a3=new ArrayList();
		
		a3.add(61);
		a3.add(62);
		a3.add(63);
		
		
		//Adding a1 in a2
		a1.addAll(a2);
		
		a1.remove(2);
		
		//Adding a2 in a3
		a2.addAll(a3);
		
		System.out.println(a1);
		System.out.println(a2);
	    
		int s=a1.size();
		System.out.println(s);
		
		//Remove all objects from collection 3
		a3.clear();
		System.out.println(a3);
		
		boolean b=a3.isEmpty();
		System.out.println(b);

		//set the value at given index position in collection 1
		a1.set(3, "Raghv");
		System.out.println(a1);
	}
}
