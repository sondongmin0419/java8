package Chapter10;

import javax.swing.*;
import java.awt.*; 

public class JScrollPaneTest extends JApplet { 
	JPanel jp;
		
	public void init() {
	   setLayout(new BorderLayout()); 
	   jp = new JPanel();
	   jp.setLayout(new GridLayout(10,5));
	   int cnt = 1;
	   for (int i=1; i<=10; i++) {
		   for(int j=1; j<=5 ; j++) {
			   jp.add(new JButton("¹öÆ°"+cnt));
			   cnt++;
		   }
	   }
	   
	   int v  = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	   int h  = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
	   JScrollPane js = new JScrollPane(jp, v, h);
	   add(js, BorderLayout.CENTER); 
	}   
}