package java8;

import java.util.Scanner;

public class day1109 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("출석, 과제, 중간고사, 기말고사 점수를 순서대로 입력하시오.");
		System.out.println("-각각 100점만점");
		System.out.println("-출석20%, 과제20%, 중간고사30%, 기말고사30% 입니다.");
		int[] arr = new int[4];
		for (int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
		double sum = arr[0]*0.2+arr[1]*0.2+arr[2]*0.3+arr[3]*0.3;
		System.out.println("총점은 "+sum+"점 입니다.");
		if (sum >=90)
		{
			System.out.println("A");
		}
		else if (sum>=80)
		{
			System.out.println("B");
		}
		else if (sum>=70)
		{
			System.out.println("C");
		}
		else if (sum>=60)
		{
			System.out.println("D");
		}
		else 
			System.out.println("F");
	}

}
