package Review.refresh;

import java.awt.*;
import javax.swing.*;

import java.util.*;
import java.util.Scanner.*;

    public class refresh2 {
        public static void main (String args[])
        {
            JFrame frame = new JFrame("Subpanel test");
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

            ImageIcon lion = new ImageIcon("src/Images/majestic.jpg");

            JLabel label1, label2;

            //Subpanel1 is setup here
            JPanel subpanel1 = new JPanel();
            subpanel1.setPreferredSize(new Dimension(250, 130));
            subpanel1.setBackground(Color.cyan);
            label1 = new JLabel("Lion", lion, SwingConstants.CENTER);
            label1.setHorizontalTextPosition(SwingConstants.RIGHT);
            subpanel1.add(label1);

            JPanel subpanel2 = new JPanel();
            subpanel2.setPreferredSize(new Dimension(250, 130));
            subpanel2.setBackground(Color.green);
            label2 = new JLabel("Lion #2", lion, SwingConstants.CENTER);
            label2.setVerticalTextPosition(SwingConstants.BOTTOM);
            subpanel2.add(label2);

            JPanel primary = new JPanel();
            primary.setBackground(Color.white);
            primary.add(subpanel1);
            primary.add(subpanel2);

            frame.getContentPane().add(primary);
            frame.pack();
            frame.setVisible(true);
        }
    }