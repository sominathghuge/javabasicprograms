package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetInterface5_Iterator {
	
	//Set interface with LinkedHashSet class
	
	public static void main(String[] args) {
		
	Set s1=new LinkedHashSet();
	
	s1.add("Performance");
	s1.add("Security");
	s1.add("Smoke");
	s1.add("Regression");
		
	System.out.println(s1);
		
	Iterator it=s1.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
