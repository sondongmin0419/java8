
package Chapter9;

import java.awt.*;
import javax.swing.*;
public class dRect extends JApplet {
	public void init() {
		setBackground(Color.white);
	} 
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawRect(20, 10, 50, 50);
		g.drawRoundRect(80, 10, 50, 50, 15, 15);
		
		g.setColor(Color.orange);
		g.draw3DRect(20, 70, 50, 50, true);
		g.fill3DRect(80, 70, 50, 50, false); 
	}
}