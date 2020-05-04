package Chapter9;


import java.awt.*;
import javax.swing.*;

public class RoundRect extends JApplet {
	public void init() {
		setBackground(Color.orange);
	} 
	 
	public void paint(Graphics g) {
		 
		for(int y=1; y<=5; y++) {
			Color myColor = new Color(0, 0, y*50);
			g.setColor(myColor);
			g.fillRect(y*30, 22, 28, 28);
		}
		
		for(int y=1; y<=5; y++) {
			Color myColor = new Color(0, y*50, 0);
			g.setColor(myColor);
			g.fillRect(y*30, 52, 28, 28);
		}
		for(int y=1; y<=5; y++) {
			Color myColor = new Color(y*50, 0, 0);
			g.setColor(myColor);
			g.fillRect(y*30, 82, 28, 28);
		}
		for(int y=1; y<=5; y++) {
			Color myColor = new Color(y*50, 0, 0);
			g.setColor(myColor);
			g.fillRoundRect(y*30+160, 22, 28, 28, 10,10);
		} 
		for(int y=1; y<=5; y++) {
			Color myColor = new Color(0, y*50, 0);
			g.setColor(myColor);
			g.fillRoundRect(y*30+160, 52, 28, 28, 10,10);
		} 
		for(int y=1; y<=5; y++) {
			Color myColor = new Color(0, 0, y*50);
			g.setColor(myColor);
			g.fillRoundRect(y*30+160, 82, 28, 28, 10,10);
		} 
	}
}
