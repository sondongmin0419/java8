package Chapter10;

import java.awt.*;
import javax.swing.*;
public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		   //FlowLayout �Ŵ��� ����
		   FlowLayout flayout = new FlowLayout();
	       //�����̳ʿ� ����
		   setLayout(flayout);
	       //�δܰ踦 �� �ٷ� ���̸�, setLayout(new FlowLayout);  
		   //�� ������Ʈ�� �����̳ʿ� �߰�
		   add(new JButton("ù��°"));
		   add(new JButton("�ι�°"));
		   setSize(300, 200);
		   setVisible(true);
	}
	
	public static void main(String args[])
	{  
		 FlowLayoutTest  flt= new FlowLayoutTest();
		 flt.setDefaultCloseOperation(EXIT_ON_CLOSE); 
 	   
	}
}
