package java8;

import java.util.Scanner;

public class day0805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄을 출력할까요?");
		int x = sc.nextInt();
		for (int i = 0; i <= x; i++) {
			if (i <= x / 2) {
				for (int j = 0; j < i; j++)
					System.out.print("#");
				System.out.println("");
			} else {
				for (int j = x-i; j >= 0; j--) {
					System.out.print("#");
				}
				System.out.println("");
			}
		}
	}

}
