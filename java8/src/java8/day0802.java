package java8;

import java.util.Scanner;

public class day0802 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello, Wordl!!  " + i);
		}
		System.out.println();
		for (int i = 9; i >= 0; i--) {
			System.out.println("Hello, Wordl!!  " + i);
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				if (j%2 == 1)
					System.out.print("#");
				else
					System.out.print("@");
			}
			System.out.println();
		}
		
		//문자열을입력받아 for문으로 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요.");
		System.out.print("입력 >");
		String str = sc.nextLine();
		for (int i =0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		System.out.println("");
	}

}
