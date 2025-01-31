package collectionFramework;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionInterface {
	
	public static void main(String[] args) {
		
		Collection s1=new LinkedList();
		
		s1.add("Somi");
		s1.add("Ram");
		s1.add("Sita");
		s1.add("Laxman");
		s1.add(261);

		System.out.println(s1);
		
		
		Collection s2=new Vector();
		
		s2.add("Ravan");
		s2.add("Bibishan");
		s2.add("Bharat");
		
		
		
		s2.addAll(s1);
		
		System.out.println(s2);
		
		s2.remove("Ravan");
		System.out.println(s2);
		
		s2.removeAll(s1);
		System.out.println(s2);
		
		boolean a= s2.contains("Laxman");
		System.out.println(a);
		
		int b= s2.size();
		System.out.println(b);
		
		
	}

}
