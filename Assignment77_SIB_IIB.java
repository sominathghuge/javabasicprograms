package javaAssignments;

//Assignment 77:Write a java program with 2SIB block, 3IIB block, 2Object  check its order of excution "
public class Assignment77_SIB_IIB {
	
	//2 SIB (Static initilization block
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	
	//2IIB(Instance initilization block)
	
	{
		System.out.println("IIB 1");
	}
	
	{
		System.out.println("IIB 2");
	}
	
	{
		System.out.println("IIB 3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		Assignment77_SIB_IIB obj1=new Assignment77_SIB_IIB();
		Assignment77_SIB_IIB obj2=new Assignment77_SIB_IIB();
		
		
		/*Order of Execution is:
		 * -SIB
		 * -Main method
		 * -IIB
		 * -Constructor
		 */
		
		
		
		
		
		
		
		
		
	}

}
