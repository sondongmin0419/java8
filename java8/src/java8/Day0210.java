package java8;

public class Day0210 {

	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		System.out.println("��� �Ѱ��� 10�������� ������ ");
		System.out.println("7������ �Ծ����ϴ�.");
		System.out.println("���������� �� �����ϱ��?");
		double result = apple - unit * 7;
		System.out.println(result);
		//�Ǽ��� ��Ȯ�� ������ ���� �ʽ��ϴ�. �ε��Ҽ������� �Ի��ϱ⋚���Դϴ�.
		//�׷��� ������ �ҋ��� ���������� �ϰ� �������� �Ǽ��� ǥ���ؾ� �մϴ�.
		
		double result2 = 1000000000000000000000000000.0 + 1.0;
		System.out.println(result2);
		
		int apple2 = 1;
		double unit2 = 1 ;
		double result3 = (apple2 * 10 - unit *7) / 10;
		System.out.println(result3);	
	}
}
