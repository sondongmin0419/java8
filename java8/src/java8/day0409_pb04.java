package java8;

import java.util.Scanner;

public class day0409_pb04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수n을 입력하시오.");
		int n = sc.nextInt();
		System.out.println("정수m을 입력하시오.");
		int m = sc.nextInt();
		System.out.println("n은 :"+n+", m은 :"+m);
		int b = m<n ? n : m;
		System.out.println(n+"과 "+m+"중 큰수는 "+b+" 입니다.");
	}

}
