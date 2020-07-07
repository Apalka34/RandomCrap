package DrawingForFunWithSimpleGui;//PAGE 365

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel1 extends JPanel {
	public void paintComponent(Graphics g) {
		Image image = new ImageIcon("BleppingDog.jpg").getImage();
		g.drawImage(image, 3, 4, this);
	}
}
