package java8;

import java.util.Scanner;

public class day1108 {

	public static void main(String[] args) {
		int x=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("�� ������ �Է��Ͻÿ�.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			x = a*b;
			System.out.println("�� ������ ���� "+x+"�Դϴ�.");
		}while (x<500);
		System.out.println("�� ������ ���� 500�� �ʰ��߽��ϴ�. ���α׷��� �����մϴ�.");
	}

}
