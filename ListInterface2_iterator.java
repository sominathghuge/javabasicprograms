package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface2_iterator {
	
	public static void main(String[] args) {
		
		List <String >l1=new ArrayList<String>();
		
		l1.add("Ram");
		l1.add("Laxman");
		l1.add("Bharat");
		l1.add("Sita");
		l1.add("Bhim");
		l1.add("Ram");
		l1.add(null);
		
		
		System.out.println(l1);
		
		
		Iterator <String> l2=l1.iterator();
		
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
