package Review;

import java.util.*;
import java.text.*;

public class Review3 {
	public static void main (String args[]){
		Scanner inp = new Scanner(System.in);
		double result1, result2;
		System.out.println("Give me a value");
		float value = inp.nextFloat();
		result1 = (4/3)*Math.PI*value*3;
		DecimalFormat fmt1 = new DecimalFormat("#.####");
		System.out.println("Volume of the sphere is : " + fmt1.format(result1));
		System.out.println("Give me another value");
		float value2 = inp.nextFloat();
		result2 = (4)*Math.PI*value2*2;
		System.out.println("The Surface Area of the Sphere : " + fmt1.format(result2));
		
	}
	
}
