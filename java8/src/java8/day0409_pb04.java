package java8;

import java.util.Scanner;

public class day0409_pb04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����n�� �Է��Ͻÿ�.");
		int n = sc.nextInt();
		System.out.println("����m�� �Է��Ͻÿ�.");
		int m = sc.nextInt();
		System.out.println("n�� :"+n+", m�� :"+m);
		int b = m<n ? n : m;
		System.out.println(n+"�� "+m+"�� ū���� "+b+" �Դϴ�.");
	}

}
