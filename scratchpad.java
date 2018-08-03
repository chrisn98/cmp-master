package Chp3_2;

public class scratchpad{
	public static void main (String args[]){
		String st1 = "CHANGE IS INEVITABLE";
		String mutation1; 
		String mutation2;
		String mutation3;
		
		mutation1 = st1.replace('E', 'X');
		mutation2 = st1.replace('I', 'Z');
		char test = st1.charAt(7);
		System.out.println("The first mutation " + mutation1);
		System.out.println("The second mutation " + mutation2);
		System.out.println("The character of st1 at specified index " + test);
		
	}
}