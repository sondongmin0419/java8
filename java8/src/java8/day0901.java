package java8;

import java.util.Scanner;

public class day0901 {

	public static void main(String[] args) {
		/*1~100�� �����ϰ� ������ ����.
		 * ���亸�� ũ�� up .���亸�� ������ down
		 * �ִ� Ƚ���� 10ȸ
		 * */
		int com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
//		System.out.println(com);
		int cnt=0;
		int user=0;
		long startTime = System.currentTimeMillis();
		while(cnt<10)
		{
		cnt++;
			do {
				System.out.println("1~100���� ������ �Է��Ͻÿ�.");
				user = sc.nextInt();
			}while(user<1 || user>100);
		if (com>user)
		{
			System.out.println(cnt+"ȸ��");
			System.out.println("�� ū ���Դϴ�.");
		}
		else if (com==user)
		{
			System.out.println(cnt+"ȸ��");
			
			long endTime=System.currentTimeMillis();
			double time = endTime -startTime;
			if (time<60000)
			{
			System.out.println("�����Դϴ�!. ���������� : "+(6000-(time/10.0))+"�� �Դϴ�.");
			System.exit(0);
			}
			else
			{
				System.out.println("�ð��ʰ��Դϴ�!. ������ 0���Դϴ�,");
			System.exit(0);
			}
		}
		else 
		{
			System.out.println(cnt+"ȸ��");
			System.out.println("�� ���� ���Դϴ�.");
		}
		System.out.println("");
		}
		long endTime=System.currentTimeMillis();
		double time = endTime -startTime;
		System.out.println("���α׷��� ����˴ϴ�.");
	}

}
