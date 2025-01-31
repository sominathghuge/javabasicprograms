package javaAssignments;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Assignment 41: Write a program to demonstrate the properties of Set in Java.

public class Assignment41_SetInterface {
	
	public static void main(String[] args) {
		
		Set a=new HashSet();
		
		a.add(45);
		a.add(89);
		a.add(98);
		a.add(null);
		a.add("Happy");
		a.add("");
		
		System.out.println(a);
		
		System.out.println("===forward iteration===");
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		boolean a1=a.contains(98);
		System.out.println(a1);
		
		boolean a2=a.remove(98);
		System.out.println(a2);
		
		int a3=a.size();
		System.out.println(a3);
		
		a.toArray();
		System.out.println(a);
		
		boolean a4=a.isEmpty();
		System.out.println(a4);
		
		Set <String>b=new HashSet<String>();
		
		b.add("RAM");
		b.add("Shyam");
		b.add("Karan");
		
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		
		
		
	}

}
