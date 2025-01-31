package javaAssignments;

import java.util.Arrays;

/*Assignment 70:
Write a array program and print them using following ways:
i) Using For Loop
ii) Using For-each Loop
iii) Print Statement (Sysout)
iv) Sysout with array function
*/
public class Assignment70_PrintArrays {
	
	public static void main(String[] args) {
		
		int array[] = {10,20,30,40,50};
		
	//	i) Using For Loop
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	
		System.out.println("======================");
		

		//ii) Using For-each Loop	
		
		for(int ArraysValue:array)
		{
			System.out.println(ArraysValue);
		}
	
		System.out.println("======================");
		
		
		//iii) Print Statement (Sysout)
		System.out.println(array);
	
		System.out.println("======================");
		
		
		//iv) Sysout with array function
		
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
