package java8;

import java.util.Scanner;

public class day0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� n�� m�� �Է��Ͻÿ�.");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int maxs=0,mins=0;
		int max,min;
		if (n>m)
		{
			max=n;
			min=m;
		}
		else
		{
			max=m;
			min=n;
		}
		
		for (int i=1;i<=max;i++)
		{
			if ((min*i)%max==0)
			{
				maxs=min*i;
				break;
			}
		}
		for (int i=min;i>=1;i--)
		{
			if (min%i==0 && max%i==0)
			{
				mins=i;
				break;
			}
		}
		System.out.println("�ִ� ����� : "+mins+", �ּ� ����� : "+maxs);
	}

}
