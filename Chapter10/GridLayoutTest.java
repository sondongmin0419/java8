package Chapter10;

import java.awt.*;
import javax.swing.*;
public class GridLayoutTest extends JFrame {

	String[] title = {"Num","/","*","-","7","8","9","+","4","5","6","=","1","2","3","Enter","0",".",",","?"}; 
	public GridLayoutTest() {
		    super("�׸��� ���̾ƿ�");
		   //�׸��� ���̾ƿ� �Ŵ��� ����
		   GridLayout glayout = new GridLayout(4, 5);
	       //�����̳ʿ� ����
		   setLayout(glayout);
	       //�� ������Ʈ��  �����̳ʿ� �߰�
		   JButton btn[]=new JButton[20];
		   for(int i=0; i<20; i++) {
			   btn[i] = new JButton(title[i]);
			   add(btn[i]);
		   }
		   
		   setSize(400, 200);
		   setVisible(true);
	}
	
	public static void main(String args[])
	{  
		 GridLayoutTest  glt= new GridLayoutTest();
		 glt.setDefaultCloseOperation(EXIT_ON_CLOSE); 
 	   
	}
}