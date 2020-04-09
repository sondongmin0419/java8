package java8;

import java.util.Scanner;

public class day1108 {

	public static void main(String[] args) {
		int x=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("두 정수를 입력하시오.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			x = a*b;
			System.out.println("두 정수의 곱은 "+x+"입니다.");
		}while (x<500);
		System.out.println("두 정수의 곱이 500을 초과했습니다. 프로그램을 종료합니다.");
	}

}
