//Program prompts user for hours, minutes, and seconds, and then 
//prints the total duration in seconds

package Review;
import java.util.Scanner;

	public class ScratchPad2{
		public static void main (String args[]){
			Scanner scan = new Scanner(System.in);
			int hrsinsec = 3600;
			int minsinsec = 60;
			int conv1;
			int conv2;
			int result;
			System.out.println("Give me the number of hours");
			int hrs = scan.nextInt();
			System.out.println("Give me the number of mins");
			int mins = scan.nextInt();
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Give me the number of seconds");
			int sec = scan.nextInt();
			//Conversions are now listed
			conv1 = hrs*3600;
			conv2 = mins*60;
			result = conv1+conv2+sec;
			System.out.println("The total duration in seconds is " + result);
			//Program terminated
			
			
			
			
			
		}
	}
			