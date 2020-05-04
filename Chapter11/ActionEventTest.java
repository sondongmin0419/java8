package Chapter11;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class ActionEventTest extends JFrame implements ActionListener { 
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	
	ActionEventTest() {
	   super("ActionEvent 처리");	
       setLayout(new FlowLayout());
    
       jbtn1 = new JButton("입력");
       add(jbtn1);
       jbtn2 = new JButton("확인");	 
       add(jbtn2);
       jbtn3 = new JButton("옵션");	
	   add(jbtn3);
	   jbtn4 = new JButton("메시지");	
	   add(jbtn4);
	   
	   jbtn1.addActionListener(this);
	   jbtn2.addActionListener(this);
	   jbtn3.addActionListener(this);
	   jbtn4.addActionListener(this);
	   
	   setSize(300, 200);
	   setVisible(true);
	   /*addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
               */			
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== jbtn1) {
			String name= JOptionPane.showInputDialog(this, "이름을  입력하세요!");
			System.out.println(name);
		}
		if(e.getSource()== jbtn2) {
			int con= JOptionPane.showConfirmDialog(this, "확인?");
			if(con==JOptionPane.YES_NO_OPTION); {
				//System.exit(0);
			}
		}
		if(e.getSource()== jbtn3) {
			String[] option={"검색","추가","취소"};
			JOptionPane.showOptionDialog(this, "원하는 잡업 선택","옵션 대화상자",JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
		}
		if(e.getSource()== jbtn4) {
			JOptionPane.showMessageDialog(this, "메시지 대화상자");
		}
	}
	
	public static void main(String[] args) {
		ActionEventTest aet = new ActionEventTest();
		aet.setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}   
}