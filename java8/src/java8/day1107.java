package java8;

import java.util.Scanner;

public class day1107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + "와/과" + b + "중 큰 값은 : " + a + "이고, 작은 값은 " + b + "입니다.");
		} else {
			System.out.println(a + "와/과" + b + "중 큰 값은 : " + b + "이고, 작은 값은 " + a + "입니다.");

		}
	}
}
