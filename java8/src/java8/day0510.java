package java8;

import java.util.Random;
import java.util.Scanner;

public class day0510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int com = (int)(Math.random()*3)+1;
		
		System.out.println(com);
		
		System.out.println("����, ����, �� �� �ϳ��� �����ϼ���.(����: a , ����: b , ��: c )");
		
		String user = sc.next();
		
		System.out.println(user);
		
		switch(user)
		{case "a":
			System.out.println("���� ����");
			if(com==1)
			{
				System.out.println("���� : ����, ��ǻ�� :����. �����ϴ�.!");
			}
			else if (com==2)	
			{
				System.out.println("���� : ����, ��ǻ�� :����. ��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if (com==3)
			{
				System.out.println("���� : ����, ��ǻ�� : ��. ������ �̰���ϴ�.!");
			}
			break;
		case "b":
			System.out.println("���� ����");
			if(com==1)
			{
				System.out.println("���� : ����, ��ǻ�� :����. ������ �̰���ϴ�.!");
			}
			else if (com ==2)
			{
				System.out.println("���� : ����, ��ǻ�� :����. �����ϴ�.!");
			}
			else if(com==3)
			{
				System.out.println("���� : ����, ��ǻ�� : ��. ��ǻ�Ͱ� �̰���ϴ�.!");
			}
			break;
		case "c":
			System.out.println("�� ����");
			if(com==1)
			{
				System.out.println("���� : ��, ��ǻ�� :����. ��ǻ�Ͱ� �̰���ϴ�.!");
			}
			else if (com==2)
			{
				System.out.println("���� : ��, ��ǻ�� :����. ������ �̰���ϴ�.!");
			}
			else if(com==3)
			{
				System.out.println("���� : ��, ��ǻ�� : ��. �����ϴ�.!");
			}
			
		}
	}

}
