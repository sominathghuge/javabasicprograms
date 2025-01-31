package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Enumeration {
	
	/*1)Enumeration is the cursor which is used to retrieve Collection
         objects one by one.
      2) Enumeration was introduced in JDK 1.0 version.
      3) Enumeration cursor can be used only with Legacy Classes. i.e.
         Vector & Stack.
      4) Enumeration Cursor can be get by elements() method.
          Enumeration e = v.elements();
      5) Methods of Enumeration cursor are:-
         hasMoreElements(), nextElement()
      6) Enumeration cursor can be used to retrieve the elements only in
         forward direction.
      7) Enumeration cursor can be used only for read operations

	 */
	
	public static void main(String[] args) {
		
		Vector <String>s=new Vector<String>();
		
		s.add("Sam");
		s.add("Java");
		s.add("JavaScript");
	    s.add("c++");
	    
	    
	    
	    System.out.println(s);
	    
	   Enumeration<String> s1= s.elements();
	    
	    while(s1.hasMoreElements())
	    {
	    	System.out.println(s1.nextElement());
	    }
	    
	}

}
