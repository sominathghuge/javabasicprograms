package javaAssignments;

//Asingment 26:
public class Assignment26_StringFunctions {

	public static void main(String[] args) {

		// Q.1: Find the index of a character 'c' in a given string.

		String a1 = "Welcome India";
		int index = a1.indexOf('c');
		System.out.println("Q.1->Ans--> " +index);

		// Q.2: Retrieve the character at index '4'in a given string.

		String str = "Programming ";
		char c = str.charAt(4);
		System.out.println("Q.2->Ans--> " +c);

		// Q.3: Concatenate two strings.

		String str1 = "Hello,";
		String str2 = "World";

		String concate=str1.concat(str2);
		System.out.println("Q.3->Ans--> "+concate);
		
		// Q.4: Extract a substring from the index '11' to the end of the string.
		
		String name = "Welcome to Java Programming";
		System.out.println(name.length());
		String sub=name.substring(11, 27);
		System.out.println("Q.4->Ans--> "+sub);
		
		//Q.5: Extract a substring from index 0 to 11
		
		String p1 = "Programming is fun";
		String sub1=p1.substring(0, 11);
		System.out.println("Q.5->Ans--> "+sub1);
		
		
	}

}
