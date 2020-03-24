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
		System.out.println("1~100중 3과 5의 공배수의 합은" + sum);

		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			} else {
				sum2 -= i;
			}
		}
		System.out.println("1~100중에 짝수는더하고 홀수는 뺀 결과" + sum2);

	}

}
