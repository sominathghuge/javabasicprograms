package javaAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

//Assignment 39:Write a program to demstrate the properties of Collection in Java and sort them using Collections class
public class Assignment39_CollectionProperties {
	
	public static void main(String[] args) {
		
		//Collection 1
		Collection<String> a=new ArrayList <String>();
		
		a.add("Kiran");
		a.add("Rohit");
		a.add("Sam");
		a.add("Tom");
		a.add(null);
		System.out.println(a);
		
		//Collection 2
		Collection<String> b=new Vector<String>();
		
		b.add("--Sanika");
		b.add("Pallavi");
		b.add("Battery");
		b.add("Komal");
		
		System.out.println(b);
		
		//Add all collection b in collection a
		a.addAll(b);
		System.out.println(a);
		
		boolean a1= a.equals(b);
		System.out.println(a1);
		
		//Remove one object from collection
		a.remove("Komal");
		System.out.println(a);
		
		//Remove all collection
		a.removeAll(b);
		System.out.println(a);
		
		int a2=a.size()	;
		System.out.println(a2);
		
		boolean a3=a.isEmpty();
		System.out.println(a3);
		
		
		//Iterator concept for traverssing perpose
		Iterator<String> it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	

}
