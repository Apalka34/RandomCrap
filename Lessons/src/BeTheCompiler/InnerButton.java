package BeTheCompiler;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerButton {
	
	JFrame frame;
	JButton b;
	
	public static void main(String[] args) {
		InnerButton gui = new InnerButton();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b = new JButton("A");
		b.addActionListener(new BListener());//add new BListener() between parentheses
		
		frame.getContentPane().add(BorderLayout.SOUTH, b);
		frame.setSize(200,100);
		frame.setVisible(true);
	}
	
	class BListener implements ActionListener {//change extends to implements
		public void actionPerformed(ActionEvent e) {
			if (b.getText().contentEquals("A")) {
				b.setText("B");
			} else {
				b.setText("A");
			}
		}
	}
}