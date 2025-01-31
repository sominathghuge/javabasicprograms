package mapInterfaceConcept;

import java.util.HashMap;
import java.util.Map;

public class MapInterface2 {
	
	public static void main(String[] args) {
		
	Map<String, Integer> a1=new HashMap<String, Integer>();
		
	    a1.put("Kiran", 5);
	    a1.put("Aashish", 9);
	    a1.put("Tanvi", 12);
	    a1.put("Anvi", 19);
	    
	    System.out.println(a1);
	    
	    
	    Map<String, Integer> a2=new HashMap<String, Integer>();
		    
	    a2.put("Raju", 23);
	    a2.put("viju", 13);
	    a2.put("Bandu", 10);
	    
	    System.out.println(a2);
	    
	    //
	    a1.putAll(a2);
	    System.out.println(a1);
	    
	    a1.remove("viju");
	    System.out.println(a1);
	    
        boolean a= a1.equals(a2);
	    System.out.println(a);
	    
	}

}
