package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface2_ListIterator {
	
	public static void main(String[] args) {
		
		
		List <String> l1=new ArrayList<String>();
		
		l1.add("Ram 1");
		l1.add("Sita 2");
		l1.add("Laxman 3");
		l1.add("Bhim 4");
		l1.add("Krushna 5");
		
		System.out.println(l1);
		
		
		ListIterator<String> l2=l1.listIterator();
		
		System.out.println("Forward iterator------");
		while(l2.hasNext())
		{
			System.out.println(l2.next());
			
		}
	
		l2.remove();
		
		System.out.println("Backward iterator-----");
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}
		
		
		
		
		
	}

}
