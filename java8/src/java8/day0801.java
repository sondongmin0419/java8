package java8;

public class day0801 {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100�� 3�� 5�� ������� ����" + sum);

		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			} else {
				sum2 -= i;
			}
		}
		System.out.println("1~100�߿� ¦���´��ϰ� Ȧ���� �� ���" + sum2);

	}

}
