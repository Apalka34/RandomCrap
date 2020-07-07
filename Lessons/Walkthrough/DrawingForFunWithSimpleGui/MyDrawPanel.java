package DrawingForFunWithSimpleGui;//PAGE 364

//import java.awt.*;
//import javax.swing.*;
//
//public class MyDrawPanel extends JPanel {
//	public void paintComponent(Graphics g) {
//		g.setColor(Color.orange);
//		g.fillRect(20, 50, 100, 100);
//	}
//}
//__________________________________________________________________________________________________
//import java.awt.*;//PAGE 365
//import javax.swing.*;
//
//public class MyDrawPanel extends JPanel {//Was MyDrawPanel1
//	
//	public void paintComponent(Graphics g) {
//		Image image = new ImageIcon("C:\\Users\\apalk\\Downloads\\BleppingDog.jpg").getImage();
//		g.drawImage(image, 3, 4, this);
//		
//	}
//}
//__________________________________________________________________________________________________
//import java.awt.*;//PAGE 365
//import javax.swing.*;
//
//public class MyDrawPanel extends JPanel {//Was MyDrawPanel2
//	public void paintComponent(Graphics g) {
//		g.fillRect(0, 0, this.getWidth(), this.getHeight());
//
//		int red = (int) (Math.random() * 256);
//		int green = (int) (Math.random() * 256);
//		int blue = (int) (Math.random() * 256);
//
//		Color randomColor = new Color(red, green, blue);
//		g.setColor(randomColor);
//		g.fillOval(70, 70, 100, 100);
//	}
//}
//__________________________________________________________________________________________________
//import java.awt.*;//PAGE 367
//import javax.swing.*;
//
//public class MyDrawPanel extends JPanel {//Was MyDrawPanel3
//	public void paintComponent(Graphics g) {
//		Graphics2D g2d = (Graphics2D) g;
//
//		GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
//		g2d.setPaint(gradient);
//		g2d.fillOval(70, 70, 100, 100);
//	}
//}
//__________________________________________________________________________________________________
import java.awt.*;//PAGE 367
import javax.swing.*;

public class MyDrawPanel extends JPanel {//Was MyDrawPanel4
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color startColor = new Color(red, green, blue);

		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color endColor = new Color(red, green, blue);

		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
	}
}
