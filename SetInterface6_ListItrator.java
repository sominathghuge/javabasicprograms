package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface6_ListItrator {
	
	public static void main(String[] args) {
		
		//Set interface with LinkedHashSet class
		//Collection s1
		Set s1=new LinkedHashSet();
		
		s1.add(11);
		s1.add(12);
		s1.add(13);
		s1.add(14);
		s1.add(15);
		
		System.out.println(s1);
		
		//Collection s2
		Set s2=new LinkedHashSet();
		
		s2.add(21);
		s2.add(22);
		s2.add(23);
		s2.add(24);
		
		System.out.println(s2);
		
		//collection s2 add in collection s1
		s1.addAll(s2);
		
		System.out.println(s1);
		
		//iterator method
		Iterator it=s1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
