package java8;

import java.util.Scanner;

public class day0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����� �Է��� �ּ���.");
		String grade = sc.next();
		
		switch(grade)
		{
		case "S":
		case "s":
			System.out.println("����� VIP�Դϴ�.");
			break;
		case "A":
		case "a":
			System.out.println("����� �����Դϴ�.");
			break;
		case "B":
		case "b":
			System.out.println("����� ������Դϴ�.");
			break;
		default:
			System.out.println("����� �Ϲݰ��Դϴ�.");	
		}
	}

}
