package javaAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Assignment 63:Write a program to print the list of animals using list iterator and use following functions like hasNext, Next, hasPrevious, previous,  add, & set.

public class Assignment63_ListIterator {
	
	public static void main(String[] args) {
		
		List <String> a=new ArrayList<String>();
		
		a.add("Camel 1");
		a.add("Cat 2");
		a.add("Dog 3");
		a.add("Elephent 4");
		a.add("Tiger 5");
		
		System.out.println(a);
		
		ListIterator <String> it=a.listIterator();
		System.out.println("===forward iteration===>");
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.add("Lion");
		}
	
		
		System.out.println("===Backward iteration===>");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
