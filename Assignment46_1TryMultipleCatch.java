package javaAssignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Assignment 46:Write a Java program that demonstrates the use of a single try and multiple catch block to handle  exceptions.

public class Assignment46_1TryMultipleCatch {
	
	public static void main(String[] args) {
		
		try {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente your arrays size");
		int rollno[] =new int [sc.nextInt()];
		
		System.out.println("Enter your values now");
		
		for(int i=0; i<rollno.length; i++)
		{
			rollno[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		
		}
		catch(ArithmeticException d)
		{
			System.out.println("Sorry..Please enter only number except 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Sorry..Please enter only integer(Not in float value) value");
		}
		catch(NegativeArraySizeException f)
		{
			System.out.println("Sorry..Please enter only Positive value");
		}
     
		
		
		
		
		
		
	}

}
