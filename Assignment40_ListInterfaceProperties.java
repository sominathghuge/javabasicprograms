package javaAssignments;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

//Assignment 40:Write a program to demonstrate the properties of List in Java"
public class Assignment40_ListInterfaceProperties {
	
	public static void main(String[] args) {
		
		
	    //Collection 1
		List <Integer>a=new Stack<Integer>();
		
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		
		//Reverse the Object in list interface
		List <Integer> p=a.reversed();
		System.out.println(p);
		
		
		//Collection 2
		List <Integer> b=new Stack<Integer>();
		
		b.add(-22);
		b.add(33);
		b.add(44);
		b.add(55);
		
		System.out.println(b);
		
		//Add Collection 1 in Collection 2
		a.addAll(b);
		System.out.println(a);
		
		//add element at position first
		a.addFirst(0);
		
		//add element at position first
		a.addLast(100);
		System.out.println(a);
		
		boolean a1= a.equals(b);
		System.out.println(a1);
		
		boolean a2= a.contains(4);
		System.out.println(a2);
		
		int a3= b.get(2);
		System.out.println(a3);
		
		int a4=b.indexOf(44);
		System.out.println(a4);
		
		System.out.println("====Forward iteration=====");
		//Iterator concept
		Iterator <Integer>it=a.iterator();
		while(it.hasNext())
		{
		  System.out.println(it.next());
		}
		
		
		//ListIterator concept
		ListIterator <Integer>it1=a.listIterator();
		
		//Forward iteration
		System.out.println("=====Forward iteration====");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		//Backward iteration
		System.out.println("=====Backward iteration====");
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		
		
	}

}
