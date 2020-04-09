package java04;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		System.out.println("출력할 문자열을 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		System.out.println("입력한 문자열 : "+sb);
		
//		sc.reverse();
//		System.out.println("리버싱 문자열 : "+sb);
		
		sc.close();
	}

}
