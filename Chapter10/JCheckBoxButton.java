package Chapter10;


import javax.swing.*;
import java.awt.*; 

public class JCheckBoxButton extends JFrame { 
	JCheckBox jcb1, jcb2, jcb3;
	JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5;
	JPanel jp1, jp2, jp3;
	
	JCheckBoxButton() {
	   super("üũ�ڽ��� ���� ��ư �����");	
           
	   jp1 = new JPanel();
	   jcb1 = new JCheckBox("���ǰ���", true);
	   jcb2 = new JCheckBox("���", true);
	   jcb3 = new JCheckBox("����", false);
	   jp1.add(jcb1);  jp1.add(jcb2);  jp1.add(jcb3);
	   add(jp1, "North");
	   	   
	   jp2 = new JPanel();
	   jrb1 = new JRadioButton("��ȥ", true);
	   jrb2 = new JRadioButton("��ȥ", false);
	   ButtonGroup bg1 = new ButtonGroup();
	   bg1.add(jrb1);  bg1.add(jrb2);
	   jp2.add(jrb1);  jp2.add(jrb2);
	   add(jp2, "Center"); 
	  	
	   jp3 = new JPanel();
	   jrb3 = new JRadioButton("�ڰ�", true);
	   jrb4 = new JRadioButton("����", false);
	   jrb5 = new JRadioButton("����", false);
	   ButtonGroup bg2 = new ButtonGroup();
	   bg2.add(jrb3);  bg2.add(jrb4);  bg2.add(jrb5);
	   jp3.add(jrb3);  jp3.add(jrb4);  jp3.add(jrb5);
	   add(jp3, "South"); 
	   
	   setSize(300, 200);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		 new JCheckBoxButton();
	}   
}