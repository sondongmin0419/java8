package java8;

import java.util.Scanner;

public class day0501 {

	public static void main(String[] args) {
		//�Էµ� ���� ¦������ Ȧ������ Ȯ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		int inputNumber = 0;
		System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��Դϴ�.");
		System.out.println("���ڸ� �Է��� �ּ���.");
		inputNumber = sc.nextInt();
//		String result = inputNumber % 2 == 0? "¦��" : "Ȧ��"; ���׿����� ���
		String result = "";//�������� 0���� �ʱ�ȭ�ϰ� ���ڿ��� ""���� �ʱ�ȭ�մϴ�.
		if(inputNumber % 2 == 0) { //if ���� ����Ͽ� ������ true�� ��� �����ϴ� �߰�ȣ ���� �ۼ�
			result = "¦��";
			System.out.println("¦������ �Ǻ����Դϴ�.");
		}
		if(inputNumber % 2 !=0) {
			result = "Ȧ��";
			System.out.println("Ȧ������ �Ǻ����Դϴ�.");
		}
		System.out.println("�Է��Ͻ� ���� "+inputNumber+" ��/�� "+result+" �Դϴ�.");
		sc.close();
	}
}
