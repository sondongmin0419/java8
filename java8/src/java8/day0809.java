package java8;

import java.util.Scanner;

public class day0809 {

	public static void main(String[] args) {
//		���α׷��� �������ִ� ������ ����ڰ� �˾Ƹ����� ����
//		����ڰ� ���� �����ϸ� ���α׷��� �ڽ��� ������ ������ ���Ͽ� ���õ� ������ �� ������ ������ ���� �˷��ش�,
		int com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
//		System.out.println(com);
		while(true)
		{
		System.out.println("1~100���� ������ �Է��Ͻÿ�.");
		int user = sc.nextInt();
		if (com>user)
		{
			System.out.println("�� ū ���Դϴ�.");
		}
		else if (com==user)
		{
			System.out.println("�����Դϴ�!.");
			System.exit(0);
		}
		else 
		{
			System.out.println("�� ���� ���Դϴ�.");
		}
		System.out.println("");
		}
		
	}

}
