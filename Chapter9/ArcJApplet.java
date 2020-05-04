package Chapter9;


import javax.swing.*; 
import java.awt.*;

public class ArcJApplet extends JApplet {
	public void init() {
		setBackground(Color.yellow);
	}   
	public void paint(Graphics g) { 
		g.setColor(Color.blue);
        g.drawArc(40, 20, 150, 50, 40, 280);
        g.fillArc(40, 100, 150, 50, 40, 280);
    }
}