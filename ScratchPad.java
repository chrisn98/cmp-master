//This program asks the user for a fahrenheit temp
//then converts the specific value from fahrenheit to celsius
package Review;
import java.util.Scanner;

	public class ScratchPad{
		public static void main (String args[]){
			float celsius;
			float main = 5/9F;
			float result;
			//User is asked to input fahrenheit temp
			Scanner fhr = new Scanner(System.in);
			System.out.println("What is the fahrenheit temperature?");
			float fhr1 = fhr.nextFloat();
			result = ((fhr1 - 32)* main);
			System.out.println("The celsius temperature is " + result);
			
			
	}
}