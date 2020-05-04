package Chapter10;

import java.awt.*;
import javax.swing.*;
public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		   //FlowLayout 매니저 생성
		   FlowLayout flayout = new FlowLayout();
	       //컨테이너에 설정
		   setLayout(flayout);
	       //두단계를 한 줄로 줄이면, setLayout(new FlowLayout);  
		   //각 컴포넌트를 컨테이너에 추가
		   add(new JButton("첫번째"));
		   add(new JButton("두번째"));
		   setSize(300, 200);
		   setVisible(true);
	}
	
	public static void main(String args[])
	{  
		 FlowLayoutTest  flt= new FlowLayoutTest();
		 flt.setDefaultCloseOperation(EXIT_ON_CLOSE); 
 	   
	}
}
