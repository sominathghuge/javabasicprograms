package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface1_listiterator {
	
	public static void main(String[] args) {
		
		List <String>a1=new ArrayList<String>();
		
		a1.add("Vishal 1");
		a1.add("Karan 2");
		a1.add("Pavan 3");
		a1.add("Krushna 4");
		
		System.out.println(a1);
		
		ListIterator <String> l1=a1.listIterator();
		
		System.out.println("Forward iterator-------------");
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		System.out.println("Backward iterator------------");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
					
		
	}

}
