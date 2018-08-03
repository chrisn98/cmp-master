package Review;

import java.util.*;

public class Review2{
		public static void main (String args[]){
			Scanner inp = new Scanner(System.in);
			double numx1, numx2, numy1, numy2;
			double r1, r2, r3, r4, r5;
			//The following program computes the distance between two points
			System.out.println("Give me the first x value");
			numx1 = inp.nextFloat();
			System.out.println("Give me the second x value");
			numx2 = inp.nextFloat();
			Scanner inp2 = new Scanner(System.in);
			System.out.println("Give me the first y value");
			numy1 = inp2.nextFloat();
			System.out.println("Give me the second y value");
			numy2 = inp2.nextFloat();
			r1 = numx2-numx1;
			r4 = Math.pow(r1, 2);
			r2 = numy2-numy1;
			r5 = Math.pow(r2, 2);
			r3 = Math.sqrt(r4+r5);
			System.out.println("The computation completed : " + r3);
			
			
			
		}
}