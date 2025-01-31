package javaAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Assignment 61:Write a program to iterate Map interface using Set<Entry<K,V>> with iterators concept.
public class Assignment61_MapIteratorConcept {

	public static void main(String[] args) {

		Map<String, Character> a = new HashMap<String, Character>();

		a.put("Aman", 'K');
		a.put("Raghav", 'J');
		a.put("Samay", 'P');
		a.put("Rajesh", 'T');

		System.out.println(a);

		System.out.println("==========Keys and Values===========");

		Set<Entry<String, Character>> a1 = a.entrySet();
		
		Iterator a2=a1.iterator();
		while(a2.hasNext())
		{
			System.out.println(a2.next());
		}
				
		
		
		
		
	}

}
