package java8;

import java.util.Scanner;

public class day0714 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(num%2==0)
		{
			System.out.println("홀수를 입력하시오.");
			num=sc.nextInt();
		}
		
		for (int i=1;i<=num;i++)
		{
			if (i<=num/2)
				
				for(int j=1;j<=i;j++)
				{
					System.out.print("$");
				}
			else
				for (int k=num-i+1;k>=1;k--)
				{
					System.out.print("$");
				}
			System.out.println("");
		}
	}


	}
