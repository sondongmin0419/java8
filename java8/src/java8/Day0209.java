package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		//��ĳ�� ����
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
//		luck = (int)Math.random()*51; �̷��Ե� ����
		
		//������� �̸��� �Է¹޽��ϴ�.
		System.out.print("�̸��� �Է��� �ּ���.");
		String name = sc.next();
		int lucky = 0;
		lucky = rd.nextInt(101);
		//������ ��� ���
		System.out.println(name + "���� ������ �����");
		String str = "%d�Դϴ�."; //String������ ���ڿ��� ������ �� �ֽ��ϴ�.
								  //String���� ���������� �� ���� ����Ǵ� ���� �ƴ϶�
								  //���� ������ �ִ� �޸� �ּҰ� ����˴ϴ�.
								  //��������ǥ�� ���ι� char���̰� ū ����ǥ�� ���θ� String���Դϴ�.
								  //ũ��� ���Ѵ�
		System.out.println(lucky + str);  //0~100������ ���� ���
		//������� 50~100������ ���� ����ϵ����ϱ�
//		lucky = rd.nextInt(51)+50;
		sc.close();
	}
}
