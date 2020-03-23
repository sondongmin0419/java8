package java8;

import java.util.Scanner;

public class day0713 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄을 출력하시겠습니까? :");
		int line = sc.nextInt();
		for (int i=line;i>=1;i--)
		{
			for (int j =0;j<=i;j++)
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
