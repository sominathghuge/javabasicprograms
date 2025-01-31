package collectionFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListInterface_VectorClass3 {
	
	public static void main(String[] args) {
		
		List <String>c1=new Vector<String>();
		
		c1.add("Somi");
		c1.add("Ram");
		c1.add("Tom");
		c1.add("Sita");
		
		System.out.println(c1);
		
		Iterator <String> it=c1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
