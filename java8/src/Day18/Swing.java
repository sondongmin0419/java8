package Day18;

import java.util.Scanner;

import java.util.Random;


public class Swing{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int user;

		int com;

		Random r = new Random();

		com = (r.nextInt() >>> 1) % 3;// ������ ���� ������ ���Ƿ� ���� �������

		System.out.print("����[0], ����[1], ��[2]�� �����Ͻÿ�==>");

		user = sc.nextInt();

		// ��ǻ�Ͱ� �߻��� ���ڿ� ���� ����,����, �� ���ڿ� ����

		// ����ڰ� �Է��� ���ڿ� ���� ����,����, �� ���ڿ� ����

		// �̿Ͱ��� �Ȱ��� �ڵ带 �ݺ��ؼ� ���� ���

		// ==> �� ��ó���� ���� ����� �̸� ����� �θ�

		// �ݺ��ڵ带 ���� �� �ִ�. == '�޼ҵ�' ��� �Ѵ�

		System.out.println("��ǻ�� : " + resultString(com));

		System.out.println("����� : " + resultString(user));

		if (user == com) // ����

			System.out.println("�����ϴ�.");

		else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1))

			// ���� else if �� ����ڰ� �̱�� �����

			System.out.println("����� �̰���ϴ�.");

		else // ����

			System.out.println("����� �����ϴ�.");

		sc.close();
	}

	public static String resultString(int n) {

		String r = "";

		if (n == 0)

			r = "����";

		else if (n == 1)

			r = "����";

		else

			r = "��";

		return r;

	}
}
