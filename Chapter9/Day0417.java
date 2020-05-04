package Chapter9;
import javax.swing.JApplet;
import java.awt.*;

public class Day0417 extends JApplet {
	String title;
	public void init() {
		title=getParameter("param1");
		if(title==null)
		{
			title="전달받은 인수가 없음.";
		}
		
	}
	public void paint(Graphics g) {
		g.drawString(title, 100, 100);
	}
	

}
