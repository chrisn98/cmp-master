package Chp3_11;

import java.awt.*;
import javax.swing.*;
import java.util.*;
	
	public class Images{
		public static void main (String args[]){
			Scanner inp = new Scanner(System.in);
			System.out.println("Input something funny");
			String str1 = inp.nextLine();
			String mutation1;
			mutation1 = str1.toUpperCase();
			
			JFrame frame = new JFrame("Authority");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
			ImageIcon lion = new ImageIcon("source/test.jpg");
			
			JLabel label1;
			label1 = new JLabel(mutation1, lion, SwingConstants.CENTER);
			label1.setHorizontalTextPosition(SwingConstants.CENTER);
			label1.setVerticalTextPosition(SwingConstants.BOTTOM);
			
			JPanel primary = new JPanel();
			primary.setPreferredSize(new Dimension(325, 270));
			primary.setBackground(Color.white);
			primary.add(label1);
			
			frame.getContentPane().add(primary);
			frame.pack();
			frame.setVisible(true);
			
		}
	}