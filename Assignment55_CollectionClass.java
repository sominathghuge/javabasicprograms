package javaAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Assignment 55:Write a program to demonstrate the collections class functions like sort, max, min, reverse, shuffle, swap, rotate, frequency, disjoint & replace
public class Assignment55_CollectionClass {
	
	public static void main(String[] args) {
		
		List <Integer>	number=new ArrayList<>();
	
		number.add(150)	;
		number.add(482);
		number.add(156);
		number.add(782);
		number.add(274);
		number.add(123);
		
		System.out.println(number);
		
		//Sorting
		Collections.sort(number);
		System.out.println("Sorting the given lists values: "+number);
		
		//Finding the max in list
		int a=Collections.max(number);
		System.out.println("Max value in given list: "+a);

		//Finding the min in list
		int b=Collections.min(number);
		System.out.println("Min value in given list: "+b);
		
		//Swap elements at specified positiion in list
		Collections.swap(number, 3, 1);
		System.out.println(number);
		
		int index=Collections.binarySearch(number, 274);
		System.out.println(index);
		
		//Shuffle elements in a list
		Collections.shuffle(number);
		System.out.println("Shuffle the given lists: "+number);

		Collections.rotate(number, 3);
		System.out.println(number);
		
		
		Collections.frequency(number, 0);
		System.out.println(number);
		
		//In two collection same lists value /result is false
		List <Integer>	number1=new ArrayList<>();
		
		number1.add(140)	;
		number1.add(452);
		number1.add(156);
		
     	boolean c=Collections.disjoint(number, number1);
		System.out.println("In number list anyone value is same as list number1: "+c);
	
		
		//reverse the number
		Collections.reverse(number);
		System.out.println(("Reverse the given list: "+number));
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
