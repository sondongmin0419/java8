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
		
//		float result4 = 3.14 + 1.23; //실수의 기본형은 double이기 떄문에 형변환이 필요하다.
		float result4 = 3.14f + 1.23f;
		System.out.println(result4); //float형 값에는 숫자의끝에 f를 붙여준다.
		
		double result5 = 3.14f + 1.23; //서로다른 자료형을 연산하게 되면 큰자료형으로 자동 형변환함.
		System.out.println(result5);
		
		long result6 = 10 + 20L;	 //정수도 동일하게 서로 다른 자료형이 연산하게 되면
		System.out.println(result6); //큰쪽으로 자동형변환 합니다.
		
		int num1 = 100;
		System.out.println(num1);
		num1 = 200;
		System.out.println(num1);
		
	}

}
