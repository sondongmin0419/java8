package Chapter9;

import javax.swing.*;
import java.awt.*;

public class JAppletLifeCycle extends JApplet {
	public void init() {   //��
		System.out.println("# init()  : �ʱ�ȭ ��ƾ");
	}
	public void start() {   //��
		System.out.println("# start() : ����  ��ƾ");
	}
	public void stop() {   //��
		System.out.println("# stop()  : ���� ��ƾ");
	}
	public void destroy() {  //��
		System.out.println("# destroy() : �Ҹ� ��ƾ");
	}
	public void paint(Graphics g) {
		System.out.println("# paint() : ��� ��ƾ");
		g.drawString("���ø� ������ ����Ŭ", 20, 20);
	}
} 