package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Overview {
	
	public static void main(String[] args) {
		
		Collection <Integer >c1=new ArrayList <Integer>();
		
		c1.add(98);
		c1.add(97);
		c1.add(85);
		c1.add(74);
		c1.add(45);
		c1.add(96);
		
		
		
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		//add method
		c2.add(89);
		c2.add('g');
		c2.add("Alpha");
		c2.add(0.005f);
		c2.add(2.5d);
		c2.add("Alpha");
		c2.add(null);
		c2.add(null);
		
		System.out.println(c2);
		
		//addAll method
		c2.addAll(c1);
		
		System.out.println(c2);
		
		//Equals method
		boolean c3=c1.equals(c2);
		System.out.println(c3);
		
		
		boolean c7=c2.equals(c1);
		System.out.println(c7);
				
		//size method	
		int c4= c2.size();
		System.out.println(c4);
		
		//contain method
		boolean c5= c2.contains("Alpha");
		System.out.println(c5);
		
		//containsAll method
		boolean c6= c2.containsAll(c1);
		System.out.println(c6);
		
		boolean c9= c2.remove(89);
		System.out.println(c9);
		
		boolean c11= c1.removeAll(c2);
		System.out.println(c11);
		
		//iterator method
		Iterator i1= c2.iterator();
		while(i1.hasNext())
		{
		  System.out.println(i1.next());
		}
		
		
		
		
	}
	

}
