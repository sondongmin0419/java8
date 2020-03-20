package java8;

import java.util.Scanner;

public class day0610 {

	public static void main(String[] args) {
		int intyear;
		Scanner sc = new Scanner(System.in);
		System.out.println("윤년을 판단할 년도를 입력하시오 : ");
		intyear = sc.nextInt();
//		int t = 0;  //윤년이면 t=1 , 아니면 t=0
	/*	if (intyear % 4 == 0) 
		{
			t = 1;
			if (intyear % 100 == 0) {
				t = 0;
				if (intyear % 400 == 0) {
					t = 1;
				} else
					t = 0;
			}
		}
		*/
		if ((intyear%4==0 && intyear%100!=0) || intyear%400==0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이아닙니다.");
		}

	}

}
