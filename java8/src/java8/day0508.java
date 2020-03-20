package java8;

import java.util.Scanner;

public class day0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 등급을 입력해 주세요.");
		String grade = sc.next();
		
		switch(grade)
		{
		case "S":
		case "s":
			System.out.println("당신은 VIP입니다.");
			break;
		case "A":
		case "a":
			System.out.println("당신은 우대고객입니다.");
			break;
		case "B":
		case "b":
			System.out.println("당신은 우수고객입니다.");
			break;
		default:
			System.out.println("당신은 일반고객입니다.");	
		}
	}

}
