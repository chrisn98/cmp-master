package Review;

import java.util.*;


public class refreshDEC2017_ProgrammingProjects {

    public static void main (String args[])
    {
        Random rand = new Random();
        int radius;
        radius = rand.nextInt(21);
        int height;
        height = rand.nextInt(21);

        double volume;
        volume = Math.PI*Math.pow(radius, 2)*height;

        double surfaceArea;
        surfaceArea = 2*Math.PI*radius*height;

        System.out.println("Volume : " + volume);
        System.out.println("Surface Area : " + surfaceArea);
    }

}
