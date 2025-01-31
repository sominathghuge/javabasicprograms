package javaAssignments;
import java.util.Arrays;

//Assignment 28: Write a Java program to create and display an array of boolean and double data types. 
//Initialize the arrays with some sample values and display them in array form."

public class Assignment28_ArrayFormate {
	public static void main(String[] args) {
		
		double d[]=new double[5];
		d[0]=0.05;
		d[1]=0.00005805;
		d[2]=0.59872;
		d[3]=0.024647;
		d[4]=0.098456;
		
		System.out.println(Arrays.toString(d));
		
	
		boolean b[]=new boolean[4];
		b[0]=true;
		b[1]=false;
		b[2]=false;
		b[3]=true;
		
		System.out.println(Arrays.toString(b));
	}

}
