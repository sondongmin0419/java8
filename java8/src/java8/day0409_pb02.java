package java8;

import java.util.Scanner;

public class day0409_pb02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���簢���� ���α��̸� �Է��Ͻÿ�.");
		int w = sc.nextInt();
		System.out.println("���簢���� ���α��̸� �Է��Ͻÿ�.");
		int h = sc.nextInt();
		
		int A=w*h;
		int P=2*(w+h);
		System.out.println("���簢���� ���α��� = "+w+", ���α��� = "+h+ "�϶�");
		System.out.println("���簢���� ���̴� "+A+" �̰�" );
		System.out.println("���簢���� �ѷ��� "+P+" �Դϴ�.");
	}
}
