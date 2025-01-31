package javaAssignments;

//Assignment 78:Write a java program with 1SIB block, 2IIB block, 1 constructor and  2 Object check its order of excution "
public class Assignment78_SIB_IIB {

	Assignment78_SIB_IIB()
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("SIB 1");
	}
	
	{
		System.out.println("IIB 1");
	}
	
	{
		System.out.println("IIB 2");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		Assignment78_SIB_IIB  obj1=new Assignment78_SIB_IIB();
		Assignment78_SIB_IIB  obj2=new Assignment78_SIB_IIB();

		/*Order of Execution is:
		 * -SIB
		 * -Main method
		 * -IIB
		 * -Constructor
		 */
		
		
		
	}
}
