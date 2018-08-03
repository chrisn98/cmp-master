package Review;

import java.util.*;

public class Review4 {
	public static void main (String args[]){
		double dat1, dat2, dat3, dat4;
		double result;
		Scanner inp = new Scanner(System.in);
		System.out.println("Give me the first length");
		float val = inp.nextFloat();
		System.out.println("Give me the second length");
		float val2 = inp.nextFloat();
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Give me the third length");
		float val3 = inp.nextFloat();
		double s = (1/2)*val+val2+val3;
		dat1 = (s-val);
		dat2 = (s-val2);
		dat3 = (s-val3);
		dat4 = Math.sqrt(s*dat1*dat2*dat3);
		System.out.println("Heron's Formula computed... : " + dat4);
		
		
		
		
	}

}
