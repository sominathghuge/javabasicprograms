package javaAssignments;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

//Assignment 54: Write a program to demonstrate the properties of Stack class and use some of the Stack functions like pop(), peak() & push().

public class Assignment54_StackClass {
	
	public static void main(String[] args) {
		
		Stack <Integer>s=new Stack <Integer>();
		
		s.add(56);
		s.add(25);
		s.add(98);
		s.add(13);
		s.add(97);
		
		System.out.println(s);
		
		s.addElement(88);
		System.out.println(s);
		
		int a=s.firstElement();
		System.out.println(a);
		
		int b=s.size();
		System.out.println(b);
		
		int c=s.capacity();
		System.out.println(c);
		
		s.addFirst(10);
		System.out.println(s);
		
		s.addLast(100);
		System.out.println(s);
		
		int d=s.getFirst();
		System.out.println(d);
		
		int e=s.getLast();
		System.out.println(e);
		
		//Remove the last item of the Vector object
		Integer t=s.pop();
		System.out.println(t);
		
		//Looks at the object at the top of this stack without removing itfrom the stack.
		Integer y=s.peek();
		System.out.println(y);
		
		//Pushes an item onto the top of this stack. This has exactlythe same effect as: addElement(item)
		Integer z=s.push(45);
		System.out.println(z);
		
		
		boolean f=s.contains(13);
		System.out.println(f);
		
		s.add(3, 5400);
		System.out.println(s);
		
		List<Integer> g=s.reversed();
		System.out.println(g);
		
		s.remove(4);
		System.out.println(s);
		
		int h=s.elementAt(3);
		System.out.println(h);
		
		System.out.println("Iterator concept==========");
		//Iterator concept
		Iterator<Integer> j=s.iterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
		
		System.out.println("ListIterator concept(Forwrad iteration)==========");
		//ListIterator concept
		ListIterator<Integer> k=s.listIterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		
		System.out.println("ListIterator concept(Backward iteration)==========");
		while(k.hasPrevious())
		{
			System.out.println(k.previous());
		}
		
		System.out.println("Enumeration concept==========");
		//Enuemaration Concept
	   Enumeration<Integer> m=s.elements();
		while(m.hasMoreElements())
		{
			System.out.println(m.nextElement());
		}
		
		s.removeAllElements();
		System.out.println(s);
		
	
		
		
		
	}

}
