package java8;

import java.util.Scanner;

public class day0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a와b를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		int max, min;
		int sum = 0;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println("a와 b를 포함하고 그 사이 정수의 합은 " + sum + "입니다.");
	}

}
