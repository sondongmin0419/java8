package java8;

import java.util.Scanner;

public class day0409_pb02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형의 가로길이를 입력하시오.");
		int w = sc.nextInt();
		System.out.println("직사각형의 세로길이를 입력하시오.");
		int h = sc.nextInt();
		
		int A=w*h;
		int P=2*(w+h);
		System.out.println("직사각형의 가로길이 = "+w+", 세로길이 = "+h+ "일때");
		System.out.println("직사각형의 넓이는 "+A+" 이고" );
		System.out.println("직사각형의 둘레는 "+P+" 입니다.");
	}
}
