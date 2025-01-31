package collectionFramework;

import java.util.ArrayList;
import java.util.List;
/*
 * 1. List follows indexing
 * 2. List allows duplicate value
 * 3. List accept multiple null value
 * 4. List follows the order of insertion.
 * 5. List having concept of iterator and ListIterator.
 * 6. List accept homegeneous and hetrogenous value.
 */
public class ListInterface {
	
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
		
		
		
		
		
		
		
		
		
	}	

}
