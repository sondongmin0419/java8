package java8;

import java.util.Scanner;

public class day0409_pb03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� N�� M�� �Է��Ͻÿ�.");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("��ȯ�� : N��"+n+" M�� "+m);
		
		//swap �ڵ�
		int temp=0;
		temp = n;	
		n = m;
		m = temp;
		System.out.println("��ȯ�� : N��"+n+" M��"+m);
		
	}

}
