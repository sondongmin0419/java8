package java8;

import java.util.Scanner;

public class Day0201 {

	public static void main(String[] args) {
		//��ĳ�ʸ� �ۼ��ϼ���.
		Scanner sc = new Scanner(System.in);
		//int�� ���� number1�� number2�� �����ϼ���.
		int number1, number2;
		//�ȳ����� ����.
		System.out.println("number1�� number2�� ���� �Է��Ͻÿ�.");
		System.out.println("�����̳� ����Ű�� ���� ������ �ּ���.");
		//�ۼ��� ��ĳ�ʷ� number1�� number2�� ���� �Է��ϼ���.(nextInt() ����ؾ���)
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		//number1�� number2�� �հ踦 ȭ�鿡 ������ּ���.
		int result = number1+number2;
		System.out.print("�� ���� �հ��");
		System.out.print(result);
		System.out.println("�Դϴ�.");
		//number1���� 10�� ���� number2���� 20�� �����ؼ� ����� 30���� ���.
		
		//��ĳ�ʸ� �ݾ��ּ���.
		sc.close();
	}

}
