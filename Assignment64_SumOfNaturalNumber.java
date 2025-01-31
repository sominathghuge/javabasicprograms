package javaAssignments;

public class Assignment64_SumOfNaturalNumber {
	
//Assignment 64: Write a program to calculate the sum of the first 50 natural numbers using a while loop.
	public static void main(String[] args) {
		
	//Using While loop
		
		int sum1=0;
		int i=1;
		
		while(i<=50)
		{
			System.out.println(i);
			sum1 +=i;
			i++;
		}
	System.out.println("The sum of first 50 natural numbers is: "+sum1);
		
		
	
	//OR
	
		//Using for loop
	
		int sum=0;
		for(int p=0; p<=50; p++)
		{
			System.out.println(p);
			 sum=sum+p;	
		}
		
		System.out.println("The sum of first 50 natural numbers is: "+sum);
		
	
	}
}
