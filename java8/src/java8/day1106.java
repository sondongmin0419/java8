package java8;

import java.util.Scanner;

public class day1106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int sum=0;
		System.out.println("정수를 입력하시오.");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (i%5==0)
			{
				cnt++;
				sum+=i;
			}
		}
		System.out.println("1부터"+n+"까지의 수 중 5의 배수의 개수는 :"+cnt+"이며 5의배수의 합은 : "+sum+"입니다.");
		
	}

}
