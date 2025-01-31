package collectionFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface2 {
	
	//Set interface with TressSet class
	public static void main(String[] args) {
		
		Set <String>a1=new TreeSet<String>();
		
		a1.add("TCS");
		a1.add("Infoysis");
		a1.add("Mahindra");
		a1.add("Tata");
		
		System.out.println(a1);
		
		
		
		Iterator <String >l1=a1.iterator();
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		
		
		
		
		
		
		
	}

}
