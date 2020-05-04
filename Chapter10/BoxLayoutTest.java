package Chapter10;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame {

	 
	public BoxLayoutTest() {
		   super("�ڽ�  ���̾ƿ�");
		   //�������� ������Ʈ �߰�		  
		   Box hBox = Box.createHorizontalBox(); 
           hBox.add(Box.createHorizontalStrut(30));
           hBox.add(new JCheckBox("�츮��������"));
           hBox.add(Box.createHorizontalStrut(30));
           hBox.add(new JCheckBox("�Ｚ����"));
           hBox.add(Box.createHorizontalStrut(30));
           hBox.add(new JCheckBox("�������"));
           hBox.add(Box.createGlue());
           
		   JPanel lpanel = new JPanel(new BorderLayout());
		   lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����"));
		   lpanel.add(hBox, BorderLayout.CENTER);
		   
		   //�������� ������Ʈ �߰�
		   Box hhBox = Box.createHorizontalBox(); 
           hhBox.add(Box.createHorizontalStrut(30));
           hhBox.add(new JCheckBox("��������"));
           hhBox.add(Box.createHorizontalStrut(30));
           hhBox.add(new JCheckBox("��ȯ����"));
           hhBox.add(Box.createHorizontalStrut(30));
           hhBox.add(new JCheckBox("�������"));
           hhBox.add(Box.createGlue());
           
		   JPanel llpanel = new JPanel(new BorderLayout());
		   llpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));
		   llpanel.add(hhBox, BorderLayout.CENTER);
		   
		   //�������� �г� �߰�
		   Box cBox = Box.createVerticalBox(); 
		   cBox.add(lpanel);
		   cBox.add(llpanel);
		   add(cBox, BorderLayout.CENTER);
		   }
		   
			
	public static void main(String args[])
	{  
		 BoxLayoutTest  blt= new BoxLayoutTest();
		 blt.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 blt.setSize(400, 200);
		 blt.setVisible(true);
	}
}