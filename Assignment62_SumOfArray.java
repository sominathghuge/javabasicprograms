package javaAssignments;

import java.util.Arrays;

//Assignment 62: Write a program to calculate the sum of all elements in an integer array using a for-each loop.

public class Assignment62_SumOfArray {
	
	static int sum=0;
	public static void main(String[] args) {
		
		int[] a=new int[4];
		
		a[0]=6;
		a[1]=6;
		a[2]=6;
		a[3]=6;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<=a.length-1; i++)
		{ 
			System.out.println(a[i]);
			sum +=a[i];
		
		}
		System.out.println("Total sum of integer array is: "+sum);
		
		
		
		
		
		
		
		
		
	
		
	}

}
