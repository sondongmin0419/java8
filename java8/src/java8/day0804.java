package java8;

import java.util.Scanner;

public class day0804 {

	public static void main(String[] args) {
		//����� ������� �Է¹޾Ƽ� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����ұ��?");
		int x = sc.nextInt();
		for (int i=0;i<x;i++)
		{
			for (int j=0;j<=i;j++)
				System.out.print("#");
			System.out.println("");
		}
	}

}
