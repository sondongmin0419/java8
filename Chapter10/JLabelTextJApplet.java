package Chapter10;

import javax.swing.*;
import java.awt.*; 

public class JLabelTextJApplet extends JApplet { 
	JTextField tf;
	JTextArea ta;
	JPasswordField pf;
		
	public void init() {
		setLayout(new FlowLayout());
		
		JLabel lb1 = new JLabel("�̸�");
		JLabel lb2 = new JLabel("�ּ�");
		JLabel lb3 = new JLabel("���");
		tf = new JTextField(20);
		ta = new JTextArea(7, 20);
		pf = new JPasswordField(20);
		
		add(lb1);
		add(tf);
		add(lb2);
		add(ta);
		add(lb3);
		add(pf);
	}   
}