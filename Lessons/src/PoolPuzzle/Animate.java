package PoolPuzzle;

import javax.swing.*;
import java.awt.*;

public class Animate {
	int x = 1;
	int y = 1;
	
	public static void main(String[] args) {
		Animate gui = new Animate();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();//set the to frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawP drawP = new MyDrawP();//set _ to MyDrawP drawP = new MyDrawP()
		frame.getContentPane().add(drawP);//set _ to frame
		frame.setSize(500, 270);//set _ to frame.setSize(500, 270)
		frame.setVisible(true);//set _ to frame
		for (int i = 0; i < 124; i++, y++, x++) {//set _ to i++
			x++;//set _ to x++
			drawP.repaint();//set _ to draw.repaint()
			try {
				Thread.sleep(50);
			} catch(Exception ex) { }
		}
	}
	class MyDrawP extends JPanel {
		public void paintComponent (Graphics g) {//set _ to g
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 250);
			g.setColor(Color.blue);
			g.fillRect(x, y, 500-x*2, 250-y*2);
		}
	}
}
