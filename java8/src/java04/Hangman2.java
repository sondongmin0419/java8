package java04;

import java.util.Scanner;

public class Hangman2 {

	public static void main(String[] args) {
		String pr = "hello";
		char[] outs = new char[pr.length()];
		int life = 5;
		int o = 0;
		for (int i = 0; i < pr.length(); i++) {
			outs[i] = '_';
		}

		Scanner sc = new Scanner(System.in);
		String answer;
		System.out.println("������ �����մϴ�.");
		while (life > 0) {

			int cnt = 0;

			System.out.print("���� : ");
			for (int i = 0; i < pr.length(); i++) {
				System.out.print(outs[i]);
			}
			System.out.println();
			System.out.println("�� " + pr.length() + "����");
			
			System.out.print("�����Է� -> ");
			answer = sc.next();
			for (int i = 0; i < pr.length(); i++) {
				if (pr.charAt(i) == answer.charAt(0)) {
					o++;
					outs[i] = pr.charAt(i);
					cnt++;
				}
			}
			if (cnt != 0) {
				for (int i = 0; i < pr.length(); i++) {
					System.out.print(outs[i]);
				}
				System.out.print("\t");
				System.out.println("���� ��ȸ : " + life + "ȸ");

			} else {
				for (int i = 0; i < pr.length(); i++) {
					System.out.print(outs[i]);
				}
				life--;
				System.out.print("\t");
				System.out.println("���� ��ȸ : " + life + "ȸ");
			}

			if (o == pr.length()) {
				System.out.println("�����մϴ� �����Դϴ�.");
				break;
			}
			if (life ==0)
			{
				System.out.println("�����Ͽ����ϴ�.");
			}

		}
		System.out.println("������ �����մϴ�.");
	}

}
