package java8;

import java.util.Scanner;

public class day0611 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� :");
		int intvalue = sc.nextInt();
		int resvalue = 0;
		
		while(intvalue >0)
		{
			resvalue = resvalue * 10;
			resvalue = resvalue + (intvalue % 10);
			intvalue = intvalue/10;
		}
		System.out.println("�Է��Ͻ� ������ ������"+resvalue+"�Դϴ�");
	}

}
