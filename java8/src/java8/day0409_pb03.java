package java8;

import java.util.Scanner;

public class day0409_pb03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 N과 M을 입력하시오.");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("교환전 : N은"+n+" M은 "+m);
		
		//swap 코드
		int temp=0;
		temp = n;	
		n = m;
		m = temp;
		System.out.println("교환후 : N은"+n+" M은"+m);
		
	}

}
