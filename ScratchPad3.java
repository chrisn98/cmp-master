

package Review;

import java.util.Scanner;

	public class ScratchPad3{
		public static void main (String args[]){
			Scanner scn1 = new Scanner(System.in);
			float quarters; //Four quarters make a dollar
			float dimes; //ten dimes in a dollar
			float nickels; //20 nickels in a dollar
			float pennies; //100 pennies in a dollar
			int qrt1;
			double result;
			System.out.println("What is the amount of quarters");
			int qrt = scn1.nextInt();
			System.out.println("What is the amount of dimes");
			int dim = scn1.nextInt();
			Scanner scn2 = new Scanner(System.in);
			System.out.println("What is the amount of nickels");
			int nick = scn2.nextInt();
			System.out.println("What is the amount of pennies");
			int pen = scn2.nextInt();
			quarters = qrt*.25F;
			dimes = dim*.10F;
			nickels = nick*.05F;
			pennies = pen*.01F;
			result = quarters+dimes+nickels+pennies;
			System.out.println("The combined value of all the money in the jar is "
					+ result);
		}
	}