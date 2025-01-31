package javaAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Assignment 49:Write a program to demonstrate the Map interface with the given details:
//1.Name and Bodyweight
//2.BankName and Bank Account ID
//3.Firstname and Height
//4.List of Household Items and their Quantities

public class Assignment49_MapInterface {
	
	public static void main(String[] args) {
		
		Map <String, Integer> a=new HashMap<String, Integer>();
		
		a.put("Raghav", 58);
		a.put("SBI", 584);
		a.put("Shravani", 5);
		a.put("Fan", 3);
		
		System.out.println(a);
		
		System.out.println("All given values-----------");
		for(String a1:a.keySet())
		{
			System.out.println(a1);
		}
		
		System.out.println("All given Keys-------------");
		for(Integer a2:a.values())
		{
			System.out.println(a2);
		}
		
		System.out.println("Both Keys and value-------------");
		for(Entry <String, Integer> a3:a.entrySet())
		{
			System.out.println(a3);
		}
		
		
		
		boolean a4=a.containsKey("Raghav");
	    System.out.println(a4);
		
		a.putIfAbsent("FamiliyMember", 5);
		System.out.println(a);
		
		a.replace("Raghav", 689);
		System.out.println(a);
		
	 
		
		
	}
	

}
