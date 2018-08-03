package Chp3_9;

import java.util.*;
import javax.swing.*;
import java.awt.*;

	public class ComponentsContainers{
		public static void main (String args[]){
			//Asks for a sentence, then replaces the letter a with b
			Scanner scn1 = new Scanner(System.in);
			System.out.println("Tell me anything");
			String inp = scn1.nextLine();
			String mutation1;
			mutation1 = inp.replace('a', 'b');
			
			//Instantiate JFrame, JPanel, and JLabel
			JFrame frame = new JFrame("Your sentence");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(250, 75));
			panel.setBackground(Color.cyan);
			
			JLabel label = new JLabel(mutation1);
			JLabel label2 = new JLabel("That's what you told me!");
			
			panel.add(label);
			panel.add(label2);
			
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
		}
	}