package java8;

import java.util.Scanner;

public class day1013 {

	public static void main(String[] args) {
//		String[][] menu = new String[4][2];
//		menu[0][0] = "��� 1��";
//		menu[0][1] = "2000";
//		menu[1][0] = "������ 1�κ�";
//		menu[2][0] = "���� 1��";
//		menu[3][0] = "���� 1�κ�";
//		System.out.println(menu[0][1];
		Scanner sc = new Scanner(System.in);
		
		int kim = 2000;
		int dduck = 2000;
		int oh = 500;
		int soon = 2000;
		int knum,dnum,onum,snum;

		System.out.println("���� ��� , ������, ����, ������ ���� ������� �Է��Ͻÿ�.");
		System.out.println("���� : ���:2000��, ������:2000��, ����:500��, ����:2000��");
		knum = sc.nextInt();
		dnum = sc.nextInt();
		onum = sc.nextInt();
		snum = sc.nextInt();
		System.out.println("������:" + (kim*knum+dduck*dnum+oh*onum+soon*snum)+"�� �Դϴ�.");
	}

}
