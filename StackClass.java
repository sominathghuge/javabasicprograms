package collectionFramework;

import java.util.Stack;

public class StackClass {
	
	public static void main(String[] args) {
		
		//Collection 1
		Stack s=new Stack();
		
		s.add(45);
		s.add(89);
		s.add(22);
		
		s.addFirst("Start");
		s.addLast("Last");
		
		int a=s.capacity();
		System.out.println(a);
		
		boolean b=s.contains(45);
		System.out.println(b);
		
		System.out.println(s.elementAt(0));
		
		boolean c=s.empty();
		System.out.println(c);
		
		System.out.println(s);
		
		
		//Collection 2
		Stack s1=new Stack();
		
		s1.add("Viju");
		s1.add("RAJU");
		
		
		s1.addAll(s);
		System.out.println(s1);
		
		s1.clear();
		System.out.println(s1);
		
		boolean d= s1.isEmpty();
		System.out.println(d);
		
		int e= s.size();
		System.out.println(e);
		
		s.pop();
		System.out.println(s);
	
		
	}

}
