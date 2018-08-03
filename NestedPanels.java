package Chp3_10;

import java.awt.*;
import javax.swing.*;

	public class NestedPanels{
		public static void main (String args[]){
			
			JFrame frame = new JFrame("Three Nested Subpanels");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
			//Calls three panels using JPanel
			
			JPanel panel1 = new JPanel();
			panel1.setPreferredSize(new Dimension(150, 100));
			panel1.setBackground(Color.green);
			JLabel label1 = new JLabel("One");
			panel1.add(label1);
			
			JPanel panel2 = new JPanel();
			panel2.setPreferredSize(new Dimension(150, 50));
			panel2.setBackground(Color.red);
			JLabel label2 = new JLabel("Two");
			panel2.add(label2);
			
			JPanel primary = new JPanel();
			primary.setBackground(Color.cyan);
			primary.add(panel1);
			primary.add(panel2);
			
			frame.getContentPane().add(primary);
			frame.pack();
			frame.setVisible(true);
			
			
			
			
			
		}
	}