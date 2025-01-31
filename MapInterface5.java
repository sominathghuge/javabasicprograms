package mapInterfaceConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface5 {
	
	public static void main(String[] args) {
		
		Map <String, Character>a=new HashMap<String, Character>();
		
		a.put("Karan", 'P');
		a.put("Pallvi", 'G');
		a.put("Shital", 'K');
		a.put("Sonu", 'N');
		a.put("Pall", 'G');
		
		
		System.out.println(a);
		
		//Using for loop for keySet method(Print the keys)
		
		for(String a1:a.keySet())
		{
			System.out.println(a1);
		}
		
		
		//Print the values using values() method
		for(Character a2: a.values())
		{
			System.out.println(a2);
		}
		
		
		//Print the Keys and values using entrySet method
		for(Entry<String, Character> a3:a.entrySet())
		{
			System.out.println(a3);
		}
		
		
	}

}
