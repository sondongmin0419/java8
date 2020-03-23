package java8;

import java.util.Scanner;

public class day0701 {

	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		System.out.println("a,b 두 정수를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a = "+a+", b = "+b);
		if (a==b)
		{
			System.out.println("Same");
		}
		else 
		{
			System.out.println("Different");
		}
	}
//	String res = a==b? "Same" : "Different";

}
