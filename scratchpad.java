package Chp2_6;
//The following programs asks if you read the message, and then asks three questions 
import java.util.Scanner;

public class scratchpad {
	public static void main (String args[]){
		double total; //statement1
		double total2; //statement2
		double total3; //all values combined
		Scanner scn1 = new Scanner(System.in);
		System.out.println("I'm writing this program because "
				+ "I'm bored");
		System.out.println("Did you read the message?");
		String read = scn1.nextLine();
		if (read.equals("yes")) {
			System.out.println("What a waste of time. Program ended.");
			System.exit(0);
		}
		else {
			if(read == "yes")
				System.out.println("Program will continue.");

		}

		Scanner scn2 = new Scanner(System.in);
		System.out.println("Awesome");
		System.out.println("Let's add two numbers. Give me the first one");
		double value1 = scn2.nextDouble();
		System.out.println("Ok. Give me the next number");
		double value2 = scn2.nextDouble();
		total = value1+value2;
		System.out.println("The values combined are " + total);
		//statement 1 ended
		System.out.println("Congratulations. Now let's divide three numbers");
		Scanner scn3 = new Scanner(System.in);
		System.out.println("Give me the first value");
		double value3 = scn3.nextDouble();
		System.out.println("Awesome. Now give me the second value");
		double value4 = scn3.nextDouble();
		System.out.println("Yay! Now give me the next number");
		double value5 = scn3.nextDouble();
		total2 = value3/value4/value5;
		System.out.println("Here are the three numbers divided! : " + total2);
		//statement 2 ended
		System.out.println("Let's now combine all values that you give me");
		Scanner val1 = new Scanner(System.in);
		System.out.println("The first value is?");
		double vl1 = val1.nextDouble();
		System.out.println("The second number is?");
		double vl2 = val1.nextDouble();
		System.out.println("The third number is?");
		double vl3 = val1.nextDouble();
		System.out.println("The fourth number is?");
		double vl4 = val1.nextDouble();
		System.out.println("The fifth number is?");
		double vl5 = val1.nextDouble();
		total3 = vl1+vl2+vl3+vl4+vl5;
		System.out.println("The combined total of the 5 values are "+ total3);
		//statement 3 ended
	    System.out.flush();  
		
		
		
	}
}
