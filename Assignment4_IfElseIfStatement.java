package javaAssignments;

//"Assignment 4: if else if - grading system consiidering the marks A+: 90-100 , A: 80-90, B: 70-80, C: 60-70, D: 50-60, less than 50 marks is FAIL"" "
public class Assignment4_IfElseIfStatement {

	public static void main(String[] args) {
		
		int a=75;
		
		if(a>=90 && a<=100)
		{
			System.out.println("The marks grade should be A+");
		}
		else if(a>=80 && a<90)
		{
			System.out.println("The marks grade should be A");
		}
		else if (a>=70 && a<80)
		{
			System.out.println("The marks grade should be B");
		}
		else if (a>=60 && a<70)
		{
			System.out.println("The marks grade should be C");
		}
		
		else if ((a>=50 && a<60))
		{
			System.out.println("The marks grade should be D");
		}
		else if(a>100)
		{
			System.out.println("Above 100 Marks is not valid ");
		}
			
		else
		{
			System.out.println("FAIL");
		}
		
		
		
		
		
	}
}
