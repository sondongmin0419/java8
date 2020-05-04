package Chapter11;


import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class MouseInputEvent extends JFrame implements MouseListener { 
	String msg;
	JLabel sbar;
	public MouseInputEvent() {
		   super("���콺������ InputEvent");
		   sbar = new JLabel();
		   add(sbar,BorderLayout.SOUTH);
		    
		   addMouseListener(this);
		   setSize(300, 200);
		   setVisible(true);
		   
	}
	 
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0)
		{
		    msg="���콺 ������ ��ư�� �������ϴ�.";
		} else
		{
			msg="���콺 ���� ��ư�� �������ϴ�.";
	 	}
		sbar.setText(msg);
			 
	}
	public void mouseReleased(MouseEvent e) {
		msg="���콺 ��ư�� ��������.";
	 	sbar.setText(msg);
			 
	}
	public static void main(String[] args) {
		 MouseInputEvent mie= new MouseInputEvent();
		 mie.setDefaultCloseOperation(EXIT_ON_CLOSE); 
	 }
}