package java8;

import java.util.Scanner;

public class day1106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int sum=0;
		System.out.println("������ �Է��Ͻÿ�.");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (i%5==0)
			{
				cnt++;
				sum+=i;
			}
		}
		System.out.println("1����"+n+"������ �� �� 5�� ����� ������ :"+cnt+"�̸� 5�ǹ���� ���� : "+sum+"�Դϴ�.");
		
	}

}
