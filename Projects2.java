import java.util.Scanner;

public class Projects2 {
    public static void main (String args[])
    {
        String name, age, college, petname;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = scan.nextLine();
        System.out.println("Enter your age : ");
        age = scan.nextLine();
        System.out.println("Enter your pet''s name : ");
        petname = scan.nextLine();
        System.out.println("Enter your college : ");
        college = scan.nextLine();

        System.out.println("Hello, my name is " + name + " and I am " + age + " years old " +
                "I'm enjoying my time at " + college + ", though I miss my " + petname + " very much! " );
    }
}
