package java8;

import java.util.Scanner;

public class day0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, quiz, answer;
		int i = 0;
		long startTime2 = System.currentTimeMillis();

		while (i < 10) {
			long startTime = System.currentTimeMillis();

			num1 = (int) (Math.random() * 7) + 2;
			num2 = (int) (Math.random() * 7) + 2;
			quiz = num1 * num2;

			System.out.print(num1 + "*" + num2 + "=");
			answer = sc.nextInt();

			if (quiz == answer)
				System.out.println("�����Դϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");

			long endTime = System.currentTimeMillis();
			System.out.println((double) (endTime - startTime) / 1000 + "��");
			System.out.println("");
			i++;
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("�� �ҿ�ð�"+(double) (endTime2 - startTime2) / 1000 + "��");



	}

}
