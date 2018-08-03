package Chp3_10;

import java.awt.*;
import javax.swing.*;

    public class refresh
    {
        public static void main (String args[])
        {
           JFrame frame = new JFrame("Test...");
           frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

           JPanel panel1 = new JPanel();
           panel1.setPreferredSize(new Dimension(840, 680));
           panel1.setBackground(Color.white);

           ImageIcon icon = new ImageIcon("src/images/lion2.png");

           JLabel label1;
           label1 = new JLabel("Some lion...", icon, SwingConstants.CENTER);
           label1.setHorizontalTextPosition(SwingConstants.RIGHT);
           label1.setVerticalTextPosition(SwingConstants.NORTH);

           panel1.add(label1);


           frame.getContentPane().add(panel1);
           frame.pack();
           frame.setVisible(true);
        }
    }