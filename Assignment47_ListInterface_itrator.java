package javaAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Assignment 47:Write a program to print the list of animals using iterator and use this following functions like hasNext, Next & remove. 

public class Assignment47_ListInterface_itrator {
	
	public static void main(String[] args) {
		
		List <String>a1=new ArrayList<String>();
		
		a1.add("Dog");
		a1.add("Cat");
		a1.add("Camel");
		a1.add("Tiger");
		a1.add("Chittah");
		
		
		System.out.println(a1);
		
		//iterator method
		//hasNext(), next()
		Iterator<String> it=a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//Remove method
		String c=a1.remove(2);
		
		if(c=="Camel")
		{
			System.out.println("The Camel animal is remove successfully from list ..Which index is 2..!");
		}
		else
		{
			System.out.println("The Camel animal name is still present in list");
		}
		
	
	}

}
