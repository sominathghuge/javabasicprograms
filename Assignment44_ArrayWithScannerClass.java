package javaAssignments;

import java.util.Arrays;
import java.util.Scanner;

//Assignment 44:Write a Java program to create an array of integers and populate it with values entered by the user using scanner class.
public class Assignment44_ArrayWithScannerClass {
	
	public static void main(String[] args) {
		
		int number[] =new int[4];
		
		//System.out.println("Enter your Array size");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your values");
		
		for(int i=0; i<number.length; i++)
		{
			number[i]=sc.nextInt();
		}
	

		System.out.println(Arrays.toString(number));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
