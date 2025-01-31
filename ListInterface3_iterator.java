package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface3_iterator {
	
	public static void main(String[] args) {
		
		List <Integer>c1=new ArrayList<Integer>();
		
		c1.add(98);
		c1.add(56);
		c1.add(52);
		c1.add(78);
		c1.add(null);
		
		
		System.out.println(c1);
		
		
		List <Integer>c2=new ArrayList<Integer>();
		
		c2.add(5000);
		
		//Add collection c2 in collection c1
		c2.addAll(c1);
		
		//Print collection c2
		System.out.println(c2);
		
		
		Iterator <Integer> i1=c2.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		
		
		

}
}