package mapInterfaceConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface3 {
	
	public static void main(String[] args) {
		
       Map<String, Integer> a1=new HashMap<String, Integer>();
		
       //add value
	    a1.put("Kiran", 5);
	    a1.put("Aashish", 9);
	    a1.put("Tanvi", 12);
	    a1.put("Anvi", 19);
	    
	    System.out.println(a1);
		
	    //replace value
		a1.replace("Kiran", 25);
		System.out.println(a1);
		
		a1.replace("Anvi", 19, 1);
		System.out.println(a1);
		
		//remove value
		a1.remove("Aashish");
		System.out.println(a1);
		
		//if key and value absent then add 
		a1.putIfAbsent("Manish", 15);
		System.out.println(a1);
		
		
		boolean a=a1.remove("Aashish", 9);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
	}

}
