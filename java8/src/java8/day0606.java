package java8;

import java.util.Scanner;

public class day0606 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����ұ��?");
		int x = sc.nextInt();
		for (int i=x;i<x+1;i++)
		{
			System.out.println(x+"���� ����մϴ�.");
			for (int j =1;j<=9;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			
		}
	sc.close();			
	}

}
