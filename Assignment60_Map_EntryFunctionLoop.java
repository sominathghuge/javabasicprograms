package javaAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Assignment 60:Write a program to iterate Map interface using Entryset function with for each loop.

public class Assignment60_Map_EntryFunctionLoop {
	
	public static void main(String[] args) {
		
		Map <String, Character>a= new HashMap<String, Character>();
		
		a.put("Aman", 'K');
		a.put("Raghav", 'J');
		a.put("Samay", 'P');
		a.put("Rajesh", 'T');
		
		System.out.println(a);
		
		
		System.out.println("==========Keys and Values===========");
		
		for(Entry<String, Character> a1: a.entrySet())
		{
			System.out.println(a1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
