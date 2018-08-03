package Chp2_6;

import java.util.*;

    public class demo {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to play the game");
            String inp = scan.nextLine();
            if (inp.equals("yes")) {
                System.out.println("Ok. Let's get started");
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Give me two numbers and a color will be generated");
                System.out.println("\nFirst number plz");
                int inp1 = scan1.nextInt();
                System.out.println("Second number plz");
                int inp2 = scan.nextInt();
                if (inp1 < inp2) {
                    System.out.println("The color is : " + "green");
                } else {
                    if (inp1 + inp2 == 20) {
                        System.out.println("The color is : " + "blue");
                    } else {
                        if (inp1 == inp2) {
                            System.out.println("Wow. Both numbers matched.");
                            System.out.println("The color is rainbow");

                        } else {
                            if (inp != "yes") {
                                System.out.println("Cannot continue");
                                System.out.println("Program terminated");
                                System.exit(0);
                            }

                            //Program terminated
                        }


                    }
                }
            }
        }
    }
