package java8;

import java.util.Scanner;

public class day0717 {

	public static void main(String[] args) {
		int life = 3;
		int score = 0;
		while (life > 0) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("����, ����, �� �� �ϳ��� ���ÿ�. (a=����,b=����,c=��,q=����)");
			String user = sc.next();
			int user_num = 0;
			int com_num = (int) (Math.random() * 3) + 1;
			String com = "";
			
			switch (com_num) {
			case 1:
				com = "����";
				break;
			case 2:
				com = "����";
				break;
			case 3:
				com = "��";
				break;
			}

			switch (user) {
			case "a":
			case "A":
				System.out.println("���� :������ �����ϼ̽��ϴ�.");
				System.out.println("��ǻ�ʹ� " + com + "�� �����߽��ϴ�.");
				user_num = 1;
				break;
			case "b":
			case "B":
				System.out.println("���� :������ �����ϼ̽��ϴ�.");
				System.out.println("��ǻ�ʹ� " + com + "�� �����߽��ϴ�.");
				user_num = 2;
				break;
			case "c":
			case "C":
				System.out.println("���� :���� �����ϼ̽��ϴ�.");
				System.out.println("��ǻ�ʹ� " + com + "�� �����߽��ϴ�.");
				user_num = 3;
				break;
			case "q":
			case "Q":
				System.out.println("������ ����Ǿ����ϴ�. �� score = "+score );
				System.exit(0);
			}
			if (user_num - com_num == 0) {
				score += 10;
				System.out.println("�����ϴ�. ���� LIFE : " + life + ", Score = " + score);

			} else if ((user_num - com_num == 1) ||  (user_num- com_num ==-2)) {
				score += 100;
				System.out.println("������ �̰���ϴ�. ���� LIFE : " + life + ", Score = " + score);
			} else 
				life -= 1;
				System.out.println("��ǻ�Ͱ� �̰���ϴ�. ���� LIFE : " + life + ", Score = " + score);
			}
		System.out.println("������ ����Ǿ����ϴ�. �� score = "+score );
		}
}