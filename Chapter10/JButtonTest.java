package Chapter10;

import javax.swing.*;
import java.awt.*; 

public class JButtonTest extends JFrame { 
	JButton jbtn1, jbtn2, jbtn3;
	
	JButtonTest() {
	   super("��ư(JButton) �߰�");	
       setLayout(new FlowLayout());
    
       jbtn1 = new JButton("�Է�");
       add(jbtn1);
       jbtn2 = new JButton("�߰�");	 
       add(jbtn2);
       jbtn3 = new JButton("����");	
	   add(jbtn3);
	  	   
	   setSize(300, 200);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		 new JButtonTest();
	}   
}