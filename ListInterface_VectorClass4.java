package collectionFramework;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListInterface_VectorClass4 {
	
	public static void main(String[] args) {
		
		List <String> c1=new Vector<String>();
		
		c1.add("Tommy");
		c1.add("Pally");
		c1.add("Gill");
		c1.add("Poll");
		
		System.out.println(c1);
		
		ListIterator<String> it=c1.listIterator();
		
		System.out.println("Forward indexing------------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Backward indexing-----------");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
