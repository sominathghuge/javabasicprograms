package collectionFramework;

import java.util.List;
import java.util.Vector;

public class ListInterface_VectorClass2 {
	
	public static void main(String[] args) {
		
		List  a1=new Vector ();
		
		a1.add(87);
		a1.add(84);
		a1.add(25);
		a1.add(29);
		a1.add(null);
		a1.add("String");
		a1.add(0.05f);
		a1.add(null);
		
		
		System.out.println(a1);
		
		List a2=new Vector();
		
		a2.add(0.3);
		a2.add(00.55);
		a2.add(000.65);
		
		//Collection a1 add in collection a2
		a2.addAll(a1);
		
		System.out.println(a2);
		
		
		
			
		
	}
	

}
