package collectionFramework;

import java.util.LinkedList;

public class ListInterface_LinkeListClass {
	
	public static void main(String[] args) {
		
		LinkedList<String > a=new LinkedList<String>();
		
		a.add("Rahul");
		a.add("Lankesh");
		a.add("Sunil");
		a.add("Pavan");
		
		System.out.println(a);
		
		LinkedList <String>a1=new LinkedList<String> ();
		
		a1.add("Raju");
		a1.add("Viju");
		a1.add("Soma");
		System.out.println(a1);
	
		//a.addAll(a1);
		//System.out.println(a);
		
		boolean value=a.contains("Sunil");
		System.out.println(value);
		
		boolean value1=a.containsAll(a1);
		System.out.println(value1);
		
		String el=a.element();
		System.out.println(el);
		
		String value2=a.get(1);
		System.out.println(value2);
		
		String value3=a.peek();
		System.out.println(value3);
		
		String value4=a.peekLast();
		System.out.println(value4);
		
		String value5=a.pop();
		System.out.println(value5);
		System.out.println(a);
		
		String value6=a.remove();
		System.out.println(value6);
		
		System.out.println(a);
		
		a.push(value5);
		System.out.println(a);
		
		int value7=a.size();
		System.out.println(value7);
		
		System.out.println(a.reversed());
		
		
		
		
	}
}
