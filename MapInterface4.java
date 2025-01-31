package mapInterfaceConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface4 {
	
	public static void main(String[] args) {
		
		 Map<String, Character> a1=new HashMap<String, Character>();
		 
		 a1.put("Ravi", 'M');
		 a1.put("Rajesh", 'M');
         a1.put("Kavita", 'F');
         a1.put("Tanvi", 'F');
         a1.put("Charan", 'M');
         
         System.out.println(a1);
         
         
         //Traversing methods in Map interface
         
         //KeySet method
         Set <String> a=a1.keySet();
         System.out.println(a);
         
         
         //values method
        Collection <Character>b= a1.values();
        System.out.println(b);
         
        
        
       //entrySet method of map interface
        Set  <Entry <String, Character>> c =a1.entrySet();
        System.out.println(c);
        
         
      //entrySet method of map interface by using Iterator concept
       Set<Entry <String, Character>> d= a1.entrySet();
       Iterator  <Entry <String, Character>> e=  d.iterator();
        while(e.hasNext())
        {
        	System.out.println(e.next());
        }
        
        
        
        
         
         
         
	}

}
