package collectionFramework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass1 {

	public static void main(String[] args) {
		
		Vector  v=new Vector();
		
		//add method
		v.add("Somi");
		v.add("Ramu");
		v.add("jeena");
		v.add("Rajesh");
		
		//AddFirst method
        v.addFirst("Raju");
		
        //AddLastMethod
		v.addLast("GhugeFamily");


		System.out.println(v);
		
		//capacity
		int i= v.capacity();
		System.out.println(i);
		
		//getIndex
		System.out.println(v.get(3));
		
		boolean b=v.isEmpty();
		System.out.println(b);
		
		//remove given index
		System.out.println(v.remove(2));
		System.out.println(v);
		
		
		
		//Iterator concept
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	
		
		//ListIterator concept
		ListIterator it1=v.listIterator();
		
		System.out.println("Forward itration-------------");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		System.out.println("Backward iteration-----------");
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		
	}
		
	
}
