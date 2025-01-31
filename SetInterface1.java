package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 1.Set don't follow indexing
 * 2.Set don't accepts duplicate value
 * 3. Set accept multiple null value
 * 4. Set don't follow order of insertion
 * 5. Set having concept of iteration only.
 * 6. Set accept both homogenous and hetrogeneous values.
 * 
 */
public class SetInterface1 {
	
	public static void main(String[] args) {
		
        ////Set interface with HashSet class	
		Set a1=new HashSet();
		
		a1.add(56);
		a1.add(64);
		a1.add(89);
		a1.add(23);
		a1.add(null);
		a1.add(null);
		a1.add(56);
		a1.add(23);
		a1.add("Somi");
		a1.add(0.05f);
		
		
		System.out.println(a1);
		
		
		//Iterator  concept
	    Iterator a2=a1.iterator();
	    
	    while(a2.hasNext())
	    {
	    	System.out.println(a2.next());
	    }
		

	}

}
