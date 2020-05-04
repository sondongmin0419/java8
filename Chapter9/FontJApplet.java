package Chapter9;

 
import java.awt.*;
import javax.swing.*;
public class FontJApplet extends JApplet{
	Font sansPlain, serifBold, serifBoldI, monoItalic;
	String param;
	public void init() {
		setSize(1000,500);
		serifBold = new Font("Serif", Font.BOLD, 10);  //ич
		serifBoldI = new Font("Serif", Font.BOLD+Font.ITALIC, 13);
		sansPlain = new Font("SansSerif", Font.PLAIN, 16);
		monoItalic = new Font("Monospaced", Font.ITALIC, 20);		
	} 
	public void paint(Graphics g) {
		g.setFont(serifBold);   //иш
		param = "Font name=Serif, style=BOLD, size=10";
		g.drawString(param, 10, 10);
		
		g.setFont(serifBoldI);
		param = "Font name=Serif, style=BOLD+ITALIC, size=13";
		g.drawString(param, 10, 50);
		
		g.setFont(sansPlain);
		param = "Font name=SansSerif, style=PLAIN, size=16";
		g.drawString(param, 10, 90);
		
		g.setColor(Color.blue);  //ищ
		g.setFont(monoItalic);
		param = "Font name=Monospaced, style=ITALIC, size=20";
		g.drawString(param, 10, 130);
	}
}
