package Chp2_2;

public class VarAssignments {
		//Listing compiled from chp 2.2
	
	//Lines 7-9 reference variable initialization
	public static void main (String args[]){
		int chris = 110;
		System.out.println("Chris's weight is : " + chris + " pounds");
		
	//Lines 12-18 reference declaration initialization and assignment statements
		int sides = 5; //declaration initialization
		System.out.println("I think the amount of sides on a dice is " + sides);
		sides = 7; //assignment statement
		System.out.println("On second thought, maybe the sides on a dice are " + sides);
		sides = 10; //assignment statement
		System.out.println("Wait, there's no no way the sides on a dice "
				+ "could be 10");
		
		/* Notes: 
		 * An assignment statement can override a declaration initialization 
		 * A variable can only hold one value in main memory 
		 * A variable is considered CONSTANT if int (or any other primitive data
		 * 	type other than BOOLEAN or CHAR) is preceded by FINAL 
		 * CONSTANT variables cannot be overriden, otherwise a compile-time error occurs
		 * Variable declaration is specified after INT --> ex. int keys = 88;
		 * The initial value of a variable declaration can be defined or undefined
		 * Constants are also known as identifiers
		 * After calling println, the var is specified without quotation marks 
		 * Basic assignment statement uses the assignment operator = 
		   		to store the result into the specified Identifier, usually a variable
		 */
		
		
	}
}
