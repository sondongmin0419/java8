package Chapter11;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class MouseEventDraw extends JApplet implements MouseListener { 
	int noval=0;
	int[] x, y;
	
	public void init() {
		x=new int[50];
		y=new int[50];
	    addMouseListener(this);
	}  
	public void paint(Graphics g) {
		 
		g.setColor(Color.blue);
		g.drawString("마우스를 클릭하면 사각형을 그림", 10, 10);
		g.setColor(Color.red);
		for (int i=1; i<=noval; i++) {
			   g.drawRect(x[i]-20, y[i]-20, 50, 50);
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if(noval<50){
			x[noval]=e.getX();
			y[noval]=e.getY();
			noval++;
		}
		repaint();
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}