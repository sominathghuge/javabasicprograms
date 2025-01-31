package javaAssignments;

import java.util.Arrays;

//Assignment 67:Write a array program to find average value from given array values.

public class Assignment67_AverageValueOfArray {

	public static void main(String[] args) {
		
		int sum=0;
		int AverageValue=0;
		int array[]= {2,8,56};
		
		System.out.println(Arrays.toString(array));
		
		for(int i=0; i<=array.length-1; i++)
		{
			System.out.println(array[i]);
			sum=sum+array[i];
			AverageValue=sum/3;
		}
		System.out.println(AverageValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
