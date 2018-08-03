package Chp3_10;

import java.awt.*;
import javax.swing.*;


public class refresh1 {
    public static void main (String args[])
    {
        JFrame frame = new JFrame("Subpanels");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.cyan);
        panel1.setPreferredSize(new Dimension(250, 50));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel2.setPreferredSize(new Dimension(250, 50));

        JPanel primary = new JPanel();
        panel2.setBackground(Color.white);
        panel2.setPreferredSize(new Dimension(250, 80));

        JLabel label1 = new JLabel("Chris");
        JLabel label2 = new JLabel("My Wife");

        panel1.add(label1);
        panel2.add(label2);

        primary.add(panel1);
        primary.add(panel2);

        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}
