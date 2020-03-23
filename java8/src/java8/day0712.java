package java8;

import java.util.Scanner;

public class day0712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄을 출력하시겠습니까? :");
		int line = sc.nextInt();
		for (int i=1;i<=line;i++)
		{
			for (int j =1;j<=i;j++)
			{
				if(j%2==1)
				 System.out.print("$");
				else
					System.out.print("@");
			}
			System.out.println();
		}
		sc.close();
	}

}
