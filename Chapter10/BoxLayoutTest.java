package Chapter10;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame {

	 
	public BoxLayoutTest() {
		   super("박스  레이아웃");
		   //수평으로 컴포넌트 추가		  
		   Box hBox = Box.createHorizontalBox(); 
           hBox.add(Box.createHorizontalStrut(30));
           hBox.add(new JCheckBox("우리투자증권"));
           hBox.add(Box.createHorizontalStrut(30));
           hBox.add(new JCheckBox("삼성증권"));
           hBox.add(Box.createHorizontalStrut(30));
           hBox.add(new JCheckBox("대우증권"));
           hBox.add(Box.createGlue());
           
		   JPanel lpanel = new JPanel(new BorderLayout());
		   lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분"));
		   lpanel.add(hBox, BorderLayout.CENTER);
		   
		   //수평으로 컴포넌트 추가
		   Box hhBox = Box.createHorizontalBox(); 
           hhBox.add(Box.createHorizontalStrut(30));
           hhBox.add(new JCheckBox("국민은행"));
           hhBox.add(Box.createHorizontalStrut(30));
           hhBox.add(new JCheckBox("외환은행"));
           hhBox.add(Box.createHorizontalStrut(30));
           hhBox.add(new JCheckBox("기업은행"));
           hhBox.add(Box.createGlue());
           
		   JPanel llpanel = new JPanel(new BorderLayout());
		   llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
		   llpanel.add(hhBox, BorderLayout.CENTER);
		   
		   //수직으로 패널 추가
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