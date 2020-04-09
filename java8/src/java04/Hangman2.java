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
		System.out.println("게임을 시작합니다.");
		while (life > 0) {

			int cnt = 0;

			System.out.print("문제 : ");
			for (int i = 0; i < pr.length(); i++) {
				System.out.print(outs[i]);
			}
			System.out.println();
			System.out.println("총 " + pr.length() + "글자");
			
			System.out.print("정답입력 -> ");
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
				System.out.println("남은 기회 : " + life + "회");

			} else {
				for (int i = 0; i < pr.length(); i++) {
					System.out.print(outs[i]);
				}
				life--;
				System.out.print("\t");
				System.out.println("남은 기회 : " + life + "회");
			}

			if (o == pr.length()) {
				System.out.println("축하합니다 정답입니다.");
				break;
			}
			if (life ==0)
			{
				System.out.println("실패하였습니다.");
			}

		}
		System.out.println("게임을 종료합니다.");
	}

}
