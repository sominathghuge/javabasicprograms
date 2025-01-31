package javaAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment48_ListToReverse {
	
//Assignment 48: Write a program using List to reverse the given list and also to reverse the words within the list o/p ex :[irawiT, ramuK, hsinaM].
	
	public static void main(String[] args) {
		
		List <String> a =new ArrayList<String> ();
		
		a.add("Manish");
		a.add("Kumar");
		a.add("Tiwari");
		
		System.out.println(a);
		
		//Reverse the List
		Collections.reverse(a);
		System.out.println(a);
		
		
		//OR
			
		//Reverse the words in lists value
    
		List <String> reverseword= new ArrayList<String>();
		
		for(String word: a)
		{
			reverseword.add(new StringBuffer(word).reverse().toString());
		}
		
		System.out.println("Reverse words in List: "+reverseword);
		
		
		
		
		
		
		
		
		
	}

}
