package java8;

import java.util.Scanner;

public class day1107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + "��/��" + b + "�� ū ���� : " + a + "�̰�, ���� ���� " + b + "�Դϴ�.");
		} else {
			System.out.println(a + "��/��" + b + "�� ū ���� : " + b + "�̰�, ���� ���� " + a + "�Դϴ�.");

		}
	}
}
