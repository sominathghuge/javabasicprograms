package javaAssignments;
import java.util.Map;
import java.util.WeakHashMap;

//Assignment 58:Write a program to iterate Map interface using for each loop for Keyset.

public class Assignment58_Map_KeySetFunctionLoop {
	
	public static void main(String[] args) {
		
		Map <String, Integer>a=new WeakHashMap<String, Integer>();
		
		a.put("Ambani", 500);
		a.put("Adani", 578);
		a.put("Tata", 900);
		a.put("Marchand", 390);
		a.put("Punawala", 235);
		
		System.out.println(a);
		
		System.out.println("==========Keys===========");
		for(String a1: a.keySet())
		{
			System.out.println(a1);
		}
		
		
		
		
		
	}

}
