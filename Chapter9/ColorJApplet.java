package Chapter9;


import javax.swing.*;
import java.awt.*;

public class ColorJApplet extends JApplet {
	 
	public void init() {
		setBackground(Color.orange);  //①
	} 
	public void paint(Graphics g) {
		Color myColor = new Color(0, 0, 0);
		g.setColor(myColor);  //②
		g.drawString("검정색 글씨를 그린다.", 40, 100);
	}
} 