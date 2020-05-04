package Chapter11;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class ItemEventTest extends JFrame {
	JLabel txt1, txt2;
	JRadioButton r1, r2, r3, r4, r5, r6; 
	//JCheckBox c1, c2, c3;
	
	public ItemEventTest() {
		   super("ItemEvent 처리");
		   setLayout(new FlowLayout());
		   //setLayout(new GridLayout(2,2));
		   //수평으로 컴포넌트 추가		  
		   Box hBox = Box.createHorizontalBox();
		   ButtonGroup rgroup=new ButtonGroup();
		   rgroup.add(r1=new JRadioButton("우리투자증권"));
		   hBox.add(r1);
		   hBox.add(Box.createHorizontalStrut(30));
		   
		   rgroup.add(r2=new JRadioButton("삼성증권"));
		   hBox.add(r2);
		   hBox.add(Box.createHorizontalStrut(30));
		   
		   rgroup.add(r3=new JRadioButton("대우증권"));
		   hBox.add(r3);
		   hBox.add(Box.createHorizontalStrut(30));
		    
           hBox.add(Box.createGlue());
           
		   JPanel lpanel = new JPanel(new BorderLayout());
		   lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분"));
		   //lpanel.add(hBox, BorderLayout.CENTER);  
		   lpanel.add(hBox); 
		   //수평으로 컴포넌트 추가
		   Box hhBox = Box.createHorizontalBox(); 
		   ButtonGroup cgroup=new ButtonGroup();
		   cgroup.add(r4=new JRadioButton("국민은행"));
		   hhBox.add(r4);
		   hhBox.add(Box.createHorizontalStrut(30));
		   cgroup.add(r5=new JRadioButton("외환은행"));
		   hhBox.add(r5);
		   hhBox.add(Box.createHorizontalStrut(30));
		   cgroup.add(r6=new JRadioButton("기업은행"));
		   hhBox.add(r6);
		   hhBox.add(Box.createHorizontalStrut(30));
		   
            
           hhBox.add(Box.createGlue());
           
		   JPanel llpanel = new JPanel(new BorderLayout());
		   llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
		   //llpanel.add(hhBox, BorderLayout.CENTER);
		   llpanel.add(hhBox);
		   
		   //수직으로 패널 추가
		   Box cBox = Box.createVerticalBox(); 
		   cBox.add(lpanel);
		   cBox.add(llpanel);
		   txt1=new JLabel("증권회사 출력됨");
		   txt1.setFont(new Font("굴림", Font.PLAIN, 16));
		   cBox.add(txt1);
		   txt2=new JLabel("은행       출력됨");
		   txt2.setFont(new Font("굴림", Font.PLAIN, 16));
		   cBox.add(txt2);
		   add(cBox);
		   		   
		   RBHandler rh=new RBHandler();
		   r1.addItemListener(rh);
		   r2.addItemListener(rh);
		   r3.addItemListener(rh);
		   r4.addItemListener(rh);
		   r5.addItemListener(rh);
		   r6.addItemListener(rh);
	}   
		
	private class RBHandler implements ItemListener {
		   public void itemStateChanged(ItemEvent e)  {
			  
				if(e.getSource()== r1)
					if(e.getStateChange()==ItemEvent.SELECTED)
						txt1.setText("선택 : 우리투자증권");
				if(e.getSource()== r2)
					if(e.getStateChange()==ItemEvent.SELECTED)
						txt1.setText("선택 : 삼성증권");
				if(e.getSource()== r3)
					if(e.getStateChange()==ItemEvent.SELECTED)
					   txt1.setText("선택 : 대우증권");
				if(e.getSource()== r4)
					if(e.getStateChange()==ItemEvent.SELECTED)
						txt2.setText("선택 : 국민은행");
				if(e.getSource()== r5)
					if(e.getStateChange()==ItemEvent.SELECTED)
						txt2.setText("선택 : 외환은행");
				if(e.getSource()== r6)
					if(e.getStateChange()==ItemEvent.SELECTED)
					   txt2.setText("선택 : 기업은행");
			}
	}
			
	public static void main(String args[])
	{  
		 ItemEventTest  iet= new ItemEventTest();
		 iet.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 iet.setSize(400, 200);
		 iet.setVisible(true);
	}
}