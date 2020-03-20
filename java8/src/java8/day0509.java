package java8;

import java.util.Scanner;

public class day0509 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a, c ,l , m 중 선택하시오.");
		String c = sc.next();
		switch(c)
		{
		case "a":
		case "A":
			System.out.println("아메리카노");
			break;
		case "c":
		case "C":
			System.out.println("카푸치노");
			break;
		case "l":
		case "L":
			System.out.println("카페라뗴");
		case "m":
		case "M":
			System.out.println("카페모카");
		}
	}

}
