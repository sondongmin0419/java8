package java8;

import java.util.Scanner;

public class day0716 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력할까요 ??");
		int x = sc.nextInt();	
		
		for (int j=1;j<=9;j++)
		{
			System.out.println(x+"*"+j+"="+x*j);
		}
		
		System.out.println();
		for (int i=1;i<=9;i++)
		{
			System.out.println(i+"단");
			for (int j=1;j<=9;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		for (int i=1;i<=9;i++)
		{
			for (int j=1;j<=9;j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
