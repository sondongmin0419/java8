package java8;

public class Day0204 {

	public static void main(String[] args) {
		double number1;
		number1 = 3.14;
		double number2;
		number2 = 1.23;
		
		double result1 = number1 + number2;
		System.out.println(result1);
		
		float result2 = (float)(number1 + number2);
		System.out.println(result2);
		
		double result3 = 3.14 + 1.23;
		System.out.println(result3);
		
//		float result4 = 3.14 + 1.23; //�Ǽ��� �⺻���� double�̱� ������ ����ȯ�� �ʿ��ϴ�.
		float result4 = 3.14f + 1.23f;
		System.out.println(result4); //float�� ������ �����ǳ��� f�� �ٿ��ش�.
		
		double result5 = 3.14f + 1.23; //���δٸ� �ڷ����� �����ϰ� �Ǹ� ū�ڷ������� �ڵ� ����ȯ��.
		System.out.println(result5);
		
		long result6 = 10 + 20L;	 //������ �����ϰ� ���� �ٸ� �ڷ����� �����ϰ� �Ǹ�
		System.out.println(result6); //ū������ �ڵ�����ȯ �մϴ�.
		
		int num1 = 100;
		System.out.println(num1);
		num1 = 200;
		System.out.println(num1);
		
	}

}
