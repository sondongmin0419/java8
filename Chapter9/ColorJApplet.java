package Chapter9;


import javax.swing.*;
import java.awt.*;

public class ColorJApplet extends JApplet {
	 
	public void init() {
		setBackground(Color.orange);  //��
	} 
	public void paint(Graphics g) {
		Color myColor = new Color(0, 0, 0);
		g.setColor(myColor);  //��
		g.drawString("������ �۾��� �׸���.", 40, 100);
	}
} 