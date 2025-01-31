package javaAssignments;

public class Assignment5_NestedIfBlock {

	public static void main(String[] args) {

		int age = 17;
		int weight = 56;

		if (age >= 18)
			if (weight >= 55) 
			{
				System.out.println("You can donate the blood");
			} else 
			{
				System.out.println("You can't donate the blood becous of your weight is less than 55");
			}
		else 
		{
			System.out.println("You can't donate the blood becous of your is age less than 18");
		}
	}
}
