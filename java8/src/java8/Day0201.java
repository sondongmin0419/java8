package java8;

import java.util.Scanner;

public class Day0201 {

	public static void main(String[] args) {
		//스캐너를 작성하세요.
		Scanner sc = new Scanner(System.in);
		//int형 변수 number1과 number2를 선언하세요.
		int number1, number2;
		//안내문구 삽입.
		System.out.println("number1과 number2의 값을 입력하시오.");
		System.out.println("공백이나 엔터키로 값을 구분해 주세요.");
		//작성된 스캐너로 number1과 number2의 값을 입력하세요.(nextInt() 사용해야함)
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		//number1과 number2의 합계를 화면에 출력해주세요.
		int result = number1+number2;
		System.out.print("두 값의 합계는");
		System.out.print(result);
		System.out.println("입니다.");
		//number1에는 10을 대입 number2에는 20을 대입해서 결과값 30으로 출력.
		
		//스캐너를 닫아주세요.
		sc.close();
	}

}
