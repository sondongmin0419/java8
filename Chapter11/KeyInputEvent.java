package Chapter11;


import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class KeyInputEvent extends JFrame implements KeyListener { 
	String msg;
	JLabel sbar;
	public KeyInputEvent() {
		   super("키보드에서의 InputEvent");
		   sbar = new JLabel();
		   add(sbar); 
		   addKeyListener(this);
		   setSize(300, 200);
		   setVisible(true);
		   
	}
	//키를 눌렀을 때 실행
	public void keyPressed(KeyEvent e) {
		msg = e.getKeyText(e.getKeyCode());
		if(e.isShiftDown()) {msg ="KeyPressed : <Shift> + "+ msg;}
		if(e.isControlDown()) {msg ="KeyPressed : <Ctrl> + "+ msg;}
		if(e.isAltDown()) {msg ="KeyPressed : <Alt> + "+ msg;}
		
		sbar.setText(msg);			 
	}
	 
	//키를 놓았을 때 실행
	public void keyReleased(KeyEvent e) {
		msg = "KeyReleased : " + e.getKeyText(e.getKeyCode());
		if(e.isShiftDown()) {msg =e.getKeyText(e.getKeyCode());}
		if(e.isControlDown()) {msg =e.getKeyText(e.getKeyCode());}
		if(e.isAltDown()) {msg =e.getKeyText(e.getKeyCode());}
		
		sbar.setText(msg);			  
	}
	
	//키를 눌렀다가 놓았을 때 실행
	public void keyTyped(KeyEvent e) {
	}
	
	public static void main(String[] args) {
		 KeyInputEvent kie= new KeyInputEvent();
		 kie.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	 } 
}