package java04;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		System.out.println("����� ���ڿ��� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		System.out.println("�Է��� ���ڿ� : "+sb);
		
//		sc.reverse();
//		System.out.println("������ ���ڿ� : "+sb);
		
		sc.close();
	}

}
