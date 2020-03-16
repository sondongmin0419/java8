package java8;

import java.util.Scanner;

public class day0310 {

	public static void main(String[] args) {
		//키보드 입략을 위한 객체
		int daegu_f;
		int daegu_b;
		int global = 100;
		int major;
		Scanner sc = new Scanner(System.in);

		System.out.println("수도입니까?(수도:1,수도아님:0) -");
		//int capital == sc.nextInt();
		//boolen isCapital = capital == 0? false : true;
		//키보드로 값을 입력
		major = sc.nextInt();
		System.out.println("인구 (단위 : 만) -");
		// int citizens = sc.nextInt()
		//키보드로 값을 입력
		daegu_f = sc.nextInt();
		System.out.println("부자의 수(단위 : 만) -");
		//키보드로 값을 입력
		//int riches = sc.nextInt();
		daegu_b = sc.nextInt();
		
		//판단 메트폴리스 여부// 논리 연산자
		//1. 한 나라의 수도이고 인구가 100만 이상이어야한다. 관계연산자
		//2. 연 소득이 1억 이상인 인구가 50만 이상이여야 한다. 관계연산자
		//boolean str = daegu_f == 1;
		//boolean isMetro1 = isCapital && (citizens>=100);
		//boolean isMetro2 = riches >= 50;
		//boolean isMetro = isMetro1 || isMetro2
		boolean str = (((major == 1) && (daegu_f>=global)) || ( daegu_b>=50))	;
		System.out.println("메트로폴리스 여부 : "+str);
		
		
	}

}
