package Chapter10;

import javax.swing.*;
import java.awt.*; 

public class JMenuTest extends JApplet { 
			
	public void init() {
		JMenuBar jmb = new JMenuBar();
		JMenu jmu1 = new JMenu("����");
		JMenu jmu2 = new JMenu("����");
		JMenu jmu3 = new JMenu("����");
		JMenuItem jmi1 = new JMenuItem("���θ����");
		JMenuItem jmi2 = new JMenuItem("����");
		JMenuItem jmi3 = new JMenuItem("����");
		jmu1.add(jmi1);
		jmu1.add(jmi2);
		jmu1.add(jmi3);
		JMenuItem jmi4 = new JMenuItem("�߶󳻱�");
		JMenuItem jmi5 = new JMenuItem("����");
		JMenuItem jmi6 = new JMenuItem("�ٿ��ֱ�");
		jmu2.add(jmi4);
		jmu2.add(jmi5);
		jmu2.add(jmi6);
		JMenuItem jmi7 = new JMenuItem("��������");
		JMenuItem jmi8 = new JMenuItem("����ǥ����");
		jmu3.add(jmi7);
		jmu3.add(jmi8);
		
		jmb.add(jmu1);
		jmb.add(jmu2);
		jmb.add(jmu3);
		
		setJMenuBar(jmb);
		 
	}   
}