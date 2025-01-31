package javaAssignments;

import java.util.Arrays;

public class Assignment68_ArrayIndexing {
	
//Assingment68: Check if number 34 is a part of your array or not If yes than also find out its indexing.				

	public class Array_Qustion {
		
		public static void main(String[] args) {
			
			int number[]=new int[4];
			
			number[0]=43;
			number[1]=89;
			number[2]=34;
			number[3]=55;
			
			System.out.println(Arrays.toString(number));
			
			int numbertocheck=34;
			
			for(int i=0; i<number.length; i++)
			{
				if(numbertocheck==number[i])
				{
					System.out.println("The given number is your part of array.");
					System.out.println("The index of array is ->"+ i);
				}
			}
			


		}
		
	}
	
}
