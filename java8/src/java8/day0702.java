package java8;

import java.util.Scanner;

public class day0702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int a = sc.nextInt();
		System.out.println("a = "+a);
		if (a%2==0)
		{
			System.out.println("a 는 짝수");
		}
		else
		{
			System.out.println("a 는 홀수");
		}
	}

}
