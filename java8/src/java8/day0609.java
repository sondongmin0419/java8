package java8;

import java.util.Random;
import java.util.Scanner;

public class day0609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int score = 0;
		int life = 3;

		// ���ӽ���
		while (life > 0) {
			int com = (int) (Math.random() * 3) + 1;
			System.out.println(com);
			System.out.println("");
			System.out.println("����, ����, �� �� �ϳ��� �����ϼ���.(����: a , ����: b , ��: c ,���� : q)");

			String user = sc.next();

			System.out.println(user);

			switch (user) {
			case "a":
				System.out.println("���� ����");
				if (com == 1) {
					System.out.println("���� : ����, ��ǻ�� :����. �����ϴ�.!");
					score += 10;
					System.out.println("score:" + score + ", life:" + life);
				} else if (com == 2) {
					System.out.println("���� : ����, ��ǻ�� :����. ��ǻ�Ͱ� �̰���ϴ�.");
					life -= 1;
					System.out.println("score:" + score + ", life:" + life);

				} else if (com == 3) {
					System.out.println("���� : ����, ��ǻ�� : ��. ������ �̰���ϴ�.!");
					score += 100;
					System.out.println("score:" + score + ", life:" + life);

				}
				break;
			case "b":
				System.out.println("���� ����");
				if (com == 1) {
					System.out.println("���� : ����, ��ǻ�� :����. ������ �̰���ϴ�.!");
					score += 100;
					System.out.println("score:" + score + ", life:" + life);

				} else if (com == 2) {
					System.out.println("���� : ����, ��ǻ�� :����. �����ϴ�.!");
					score += 10;
					System.out.println("score:" + score + ", life:" + life);

				} else if (com == 3) {
					System.out.println("���� : ����, ��ǻ�� : ��. ��ǻ�Ͱ� �̰���ϴ�.!");
					life -= 1;
					System.out.println("score:" + score + ", life:" + life);

				}
				break;
			case "c":
				System.out.println("�� ����");
				if (com == 1) {
					System.out.println("���� : ��, ��ǻ�� :����. ��ǻ�Ͱ� �̰���ϴ�.!");
					life -= 1;
					System.out.println("score:" + score + ", life:" + life);

				} else if (com == 2) {
					System.out.println("���� : ��, ��ǻ�� :����. ������ �̰���ϴ�.!");
					score += 100;
					System.out.println("score:" + score + ", life:" + life);

				} else if (com == 3) {
					System.out.println("���� : ��, ��ǻ�� : ��. �����ϴ�.!");
					score += 10;
					System.out.println("score:" + score + ", life:" + life);

				}
			case "q":
				System.out.println("������ �����մϴ�.");
				life = 0;
				break;

			}
			System.out.println("������ ����Ǿ����ϴ�.");
		}
	}

}
