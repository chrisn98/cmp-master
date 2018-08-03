package Review ;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

    public class refreshDEC2017
    {
        public static void main (String args[])
        {
            String overview = new String("This is a test");
            System.out.println("There are : " + overview.length() + " characters");

            String introduction = new String("introduction");
            System.out.println("The 8th character is : " + introduction.charAt(8));

            String string;
            String name = new String("Christopher");
            string = name.toUpperCase();
            System.out.println(string);

            String change;
            String original = new String("Original ej");
            change = original.replace('e', 'j');
            System.out.println("Mutation : " + change);

            String m1, m2, m3;
            m1 = "Quest for the Holy Grail";
            m2 = m1.toLowerCase();
            m3 = m1 + " " + m2;
            System.out.println(m3.replace('g','z'));

            //import java.awt.*;
            // imports graphic components require for applets, JFrame, ETC, to work.

            Random rand = new Random();
            int int1;
            int1 = rand.nextInt(20);
            System.out.println("Some random value from 0-19 : " + int1);

            int int2;
            int2 = rand.nextInt(8) + 1;
            System.out.println("Some random value from 0-9 : " + int2) ;

            Random ex38 = new Random();
            int a,b,c,d,e,f;
            a = ex38.nextInt(9) + 1;
            b = ex38.nextInt(401);
            c = ex38.nextInt(11);
            d = ex38.nextInt(401);
            e = ex38.nextInt(26) + 25;
            f = ex38.nextInt(10) - 15;
            System.out.println("Bounds :" + a + "\t" + b + "\t" + c + "\t" + d + "\t" + e + "\t" + f);

            int num1, num2;
            double num3;
            num1 = 5;
            num2 = 6;
            num3 = 7;
            double result;
            result = Math.sqrt(num1+num2);
            num3 = result;
            System.out.println("The number is : " + num3);

            int num34 = -5;
            int result34;
            result34 = Math.abs(num34);
            System.out.println("The absolute value of the result is : " + result34);

            DecimalFormat fmt = new DecimalFormat("0.###");
            float val = 5.3948374F;
            System.out.println("Value formatted to three decimal places : " + fmt.format(val));

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a value : " );
            double res;
            res = scan.nextDouble();
            double pow;
            pow = Math.pow(res, 4);
            System.out.println("Value you inputted, raised to the fourth power : " + pow);





        }
    }