package java8;

import java.util.Scanner;

public class day0610 {

	public static void main(String[] args) {
		int intyear;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Ǵ��� �⵵�� �Է��Ͻÿ� : ");
		intyear = sc.nextInt();
//		int t = 0;  //�����̸� t=1 , �ƴϸ� t=0
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
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����̾ƴմϴ�.");
		}

	}

}
