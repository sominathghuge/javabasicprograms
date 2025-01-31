package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set interface with HashSet class
public class SetInterface4 {
		
		public static void main(String[] args) {
			
			Set <String> s1=new HashSet<String>();
			
			s1.add("Ram");
			s1.add("Sitaa");
			s1.add("Laxman");
			s1.add("Vitthal");
			
			System.out.println(s1);
			
			Iterator<String> i1=s1.iterator();
			
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			
           
}
}