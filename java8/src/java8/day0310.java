package java8;

import java.util.Scanner;

public class day0310 {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü
		int daegu_f;
		int daegu_b;
		int global = 100;
		int major;
		Scanner sc = new Scanner(System.in);

		System.out.println("�����Դϱ�?(����:1,�����ƴ�:0) -");
		//int capital == sc.nextInt();
		//boolen isCapital = capital == 0? false : true;
		//Ű����� ���� �Է�
		major = sc.nextInt();
		System.out.println("�α� (���� : ��) -");
		// int citizens = sc.nextInt()
		//Ű����� ���� �Է�
		daegu_f = sc.nextInt();
		System.out.println("������ ��(���� : ��) -");
		//Ű����� ���� �Է�
		//int riches = sc.nextInt();
		daegu_b = sc.nextInt();
		
		//�Ǵ� ��Ʈ������ ����// �� ������
		//1. �� ������ �����̰� �α��� 100�� �̻��̾���Ѵ�. ���迬����
		//2. �� �ҵ��� 1�� �̻��� �α��� 50�� �̻��̿��� �Ѵ�. ���迬����
		//boolean str = daegu_f == 1;
		//boolean isMetro1 = isCapital && (citizens>=100);
		//boolean isMetro2 = riches >= 50;
		//boolean isMetro = isMetro1 || isMetro2
		boolean str = (((major == 1) && (daegu_f>=global)) || ( daegu_b>=50))	;
		System.out.println("��Ʈ�������� ���� : "+str);
		
		
	}

}
