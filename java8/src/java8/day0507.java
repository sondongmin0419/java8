package java8;

import java.util.Random;

public class day0507 {

	public static void main(String[] args) {
		Random rd = new Random();
		int now = rd.nextInt(4)+9;
		System.out.println("����ð��� "+now+"�� �Դϴ�.");
		System.out.println("���� �ϰ�");
		
		switch(now)
		{
		case 9:
			System.out.println("9�ÿ� ���");
		case 10:
			System.out.println("10�ÿ� ȸ��");
		case 11:
			System.out.println("11�� ����ó��");
		case 12:
			System.out.println("12�� ���ɽð�");
		}
		
	}

}
