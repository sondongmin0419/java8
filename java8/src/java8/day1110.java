package java8;

import java.util.Scanner;

public class day1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��ǰ�� �ܰ��� ������ �Է��Ͻÿ�.");
		int price = sc.nextInt();
		int num = sc.nextInt();
		int sum = price * num;
		int sum2=sum;
		int sale=0;
		if (sum >=1000000)
		{
			sum2=(int)(sum*0.6);
			sale=40;
		}
		else if (sum>500000)
		{
			sum2=(int)(sum*0.7);
			sale=30;
		}
		System.out.println("��ǰ���� : "+price/10000+"����, ��ǰ ���� ; "+num+"��");
		System.out.println("�� ��ǰ���԰����� "+sum/10000+"�����̶� "+sale+"%�����Ͽ� "+sum2/10000+"���� �Դϴ�.");
		
	}

}
