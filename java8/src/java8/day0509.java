package java8;

import java.util.Scanner;

public class day0509 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a, c ,l , m �� �����Ͻÿ�.");
		String c = sc.next();
		switch(c)
		{
		case "a":
		case "A":
			System.out.println("�Ƹ޸�ī��");
			break;
		case "c":
		case "C":
			System.out.println("īǪġ��");
			break;
		case "l":
		case "L":
			System.out.println("ī����");
		case "m":
		case "M":
			System.out.println("ī���ī");
		}
	}

}
