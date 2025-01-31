package javaAssignments;
import java.util.Enumeration;
import java.util.Vector;

//Assignment 56: Write a program to print the list of animals using enumeration"
public class Assignment56_Enumeration{
	
	public static void main(String[] args) {
	
		Vector <String>v=new Vector<>();
		
		v.add("Cat");
		v.add("Dog");
		v.add("Camel");
		v.add("Cow");
		v.add("Elephent");
		
		System.out.println(v);
		
		Enumeration <String> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		int a= v.hashCode();
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
