package Chapter11;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class KeyEventDraw extends JApplet implements KeyListener { 
	String kname=" ";
		
	public void init() {
		this.requestFocus();
	    addKeyListener(this);
	}  
	public void paint(Graphics g) {
		
		g.setColor(Color.red);
		g.drawString("Ű������ Ű�� ������", 20, 20);
		g.setColor(Color.blue);
		g.drawString("Ű�̸�, Ű�� ǥ��", 20, 40);
		
	}
	//Ű�� ������ �� ����
	public void keyPressed(KeyEvent e) {
		kname="Key Pressed : " + e.getKeyText(e.getKeyCode());
		showStatus(kname);
		repaint();
	}
	//Ű�� ������ �� ����
	public void keyReleased(KeyEvent e) {
	}
	//Ű�� �����ٰ� ������ �� ����
	public void keyTyped(KeyEvent e) {
	}
	 
}