package Chp3_7;

import javax.swing.*;
import java.awt.*;

	public class ScratchPad2 {
		public static void main (String args[]){
			JFrame frame = new JFrame("AUTHORITY WITH A LION");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
			ImageIcon lion = new ImageIcon("source/test.jpg");
			
			
			JLabel lb1; 
			lb1 = new JLabel("Above is a lion", lion, SwingConstants.CENTER);
			lb1.setHorizontalTextPosition(SwingConstants.CENTER);
			lb1.setVerticalTextPosition(SwingConstants.BOTTOM);
			
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(325, 270));
			panel.setBackground(Color.white);
			panel.add(lb1);
			
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
		}
	}