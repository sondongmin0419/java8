package java8;

import java.util.Scanner;

public class day0804 {

	public static void main(String[] args) {
		//몇술을 출력할지 입력받아서 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄을 출력할까요?");
		int x = sc.nextInt();
		for (int i=0;i<x;i++)
		{
			for (int j=0;j<=i;j++)
				System.out.print("#");
			System.out.println("");
		}
	}

}
