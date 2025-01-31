package javaAssignments;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

//Assignment 57: Write a program to demostrate the Map interface functions like put, remove, putAll, equals, replace, putIfAbsent, keyset, values, isempty, containskey, containsvalue & clear.

public class Assignment57_MapInterface {
	
	public static void main(String[] args) {
		
		Map <String, Integer>a1=new LinkedHashMap<String, Integer>();
	
		a1.put("Tushar", 10);
		a1.put("Ashish", 20);
		a1.put("Sunil", 30);
		a1.put("Tarun", 40);
		a1.put("Rama", 50);     //Accept homegeneous and hytrogeneous value
		a1.put("Rama", 50);    //Not allow duplicate
		a1.put(null, 0);       //Accept only one null value
		a1.put("Rama", 9999);    //Not follow indexing, Order of insertion
		a1.put("Rama", 8888);  //Keys is not allow duplicate but when you value make up duplicate then update previous value for same key.  
	
		
		System.out.println(a1);
		
		Map <String, Integer>a2=new WeakHashMap<String, Integer>();
		
		a2.put("Pallavi", 100);
		
		a2.putAll(a1);
		System.out.println(a2);
		
		boolean b=a2.equals(a1);
	    System.out.println(b);
		
		a2.putIfAbsent("Kiran", 69);
		System.out.println(a2);
		
		int c=a2.replace("Kiran", 900);
		System.out.println(c);
		
		a2.remove("Kiran", 900);
		System.out.println(a2);
		
		boolean d=a1.containsKey("Tarun");
		System.out.println(d);
		
		boolean e=a1.containsValue(50);
		System.out.println(e);
		
		
		System.out.println("=============Keys==============");
		for(String f: a1.keySet())
		{
			System.out.println(f);
		}
		
		
		System.out.println("=============Values==============");
		for(Integer g: a1.values())
		{
			System.out.println(g);
		}
		
		
		System.out.println("=============Keys and Values==============");
		for(Entry<String, Integer> h: a1.entrySet())
		{
			System.out.println(h);
		}
		
		
		a2.clear();
		System.out.println(a2);
		
		
		
		
		
		
	}

}
