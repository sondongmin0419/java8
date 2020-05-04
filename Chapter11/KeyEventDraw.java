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
		g.drawString("키보드의 키를 누르면", 20, 20);
		g.setColor(Color.blue);
		g.drawString("키이름, 키값 표시", 20, 40);
		
	}
	//키를 눌렀을 때 실행
	public void keyPressed(KeyEvent e) {
		kname="Key Pressed : " + e.getKeyText(e.getKeyCode());
		showStatus(kname);
		repaint();
	}
	//키를 놓았을 때 실행
	public void keyReleased(KeyEvent e) {
	}
	//키를 눌렀다가 놓았을 때 실행
	public void keyTyped(KeyEvent e) {
	}
	 
}