package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetInterface3 {
	
	//Set interface with HashSet class
	public static void main(String[] args) {
		
		Set <String> a1=new HashSet<String >();
		
		a1.add("Honda");
		a1.add("Pulser");
		a1.add("Platina");
		a1.add("Passion");
			
		//print collection a1
		System.out.println(a1);
		
		Set<String>	a2= new HashSet<String>();
		
		a2.add("Suzuki");
		a2.add("Nano");
		a2.add("kia");
		
		//add all collection a2 in collection c1
		a2.addAll(a1);
		
		//print collection a2
		System.out.println(a2);
		
		
		Iterator<String> it=a2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//Euqals method
		boolean b=a2.equals(a1);
		System.out.println(b);
		
		
	}

}
