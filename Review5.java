package Review;

import javax.swing.*;
import java.awt.*;

	public class Review5{
		public static void main (String args[]){
			JFrame frame = new JFrame("AUTHORITY");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
			ImageIcon icon = new ImageIcon("source/images/lion_256.jpeg");
			ImageIcon icon2 = new ImageIcon("source/images/lion.jpeg");
			ImageIcon icon3 = new ImageIcon("source/images/lions.gif");
			ImageIcon icon4 = new ImageIcon("source/images/test.jpg");
			
			JLabel lb1;
			JLabel lb2, lb3, lb4;
			lb1 = new JLabel(icon);
			lb2 = new JLabel(icon2);
			lb3 = new JLabel(icon3);
			lb4 = new JLabel(icon4);
			
			
			JPanel panel1 = new JPanel();
			panel1.setPreferredSize(new Dimension(500, 500));
			panel1.setBackground(Color.white);
			panel1.add(lb1);
			panel1.add(lb2);
			
			JPanel panel2 = new JPanel();
			panel2.setPreferredSize(new Dimension(500, 500));
			//panel2.setBackground(Color.white);
			panel2.add(lb3);
			panel2.add(lb4);
			
			JPanel primary = new JPanel();
			primary.setPreferredSize(new Dimension(2000, 300));
			primary.setBackground(Color.white);
			primary.add(panel1);
			primary.add(panel2);
			
			
			frame.getContentPane().add(primary);
			frame.pack();
			frame.setVisible(true);
			
		}
	}