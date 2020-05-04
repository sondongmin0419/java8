package Chapter9;


import javax.swing.*; 
import java.awt.Color;
import java.awt.Graphics;

public class OvalJApplet extends JApplet {
	public void init() {
		setBackground(Color.orange);
	}   
	public void paint(Graphics g) {
            g.drawOval(20, 20, 60, 60);
            g.fillOval(100, 20, 90, 60); 
    }
}