package javaAssignments;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

//"Assignment 53:Write a program to demonstrate the properties of Vector class and also use some of the vector functions like addElements, firstElement, lastElement, removeElement, removeElementAt, removeAllElement & capacity"
public class Assignment53_VectorClass {

	public static void main(String[] args) {
		
		Vector <String>v=new Vector <String>();
		
		v.add("Tushar");
		v.add("Kishor");
		v.add("Ram");
		v.add("Sachin");
		v.add("Raman");
		
		System.out.println(v);
		
	
		v.addFirst("FirstElement-");
		v.addLast("-LastElement");
		
		System.out.println(v);
		
		int a=v.capacity();
		System.out.println(a);
		
		int b=v.indexOf("Ram");
		System.out.println(b);
		
		boolean c= v.contains("Rahul");
		System.out.println(c);
		
		v.add(3, "Rahul");
		System.out.println(v);
		
		String d= v.elementAt(4);
		System.out.println(d);
		
		String e=v.getFirst();
		System.out.println(e);
		
		String f=v.getLast();
		System.out.println(f);
		
		String g=v.firstElement();
		System.out.println(g);
		
		
		String h=v.lastElement();
		System.out.println(h);
		
		v.remove(0);
		System.out.println(v);
		
		v.removeElement("Sachin");
		System.out.println(v);
		
		System.out.println("====Enumeration concept=====");
		Enumeration <String>it =v.elements();
		while(it.hasMoreElements())
		{
			System.out.println(it.nextElement());
		}
		
		
		//Reverse method
		List<String> j=v.reversed();
		System.out.println(j);
		
		v.removeAllElements();
		System.out.println(v);
		
		
	
		
	}
	

}
