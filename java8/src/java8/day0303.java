package java8;

public class day0303 {

	public static void main(String[] args) {
		int number1 = 100; //지역변수
		System.out.println(number1);
		
		{
			//중괄호 블럭
			System.out.println(number1);
			int number2 = 200;
			System.out.println(number2);
		}
//		System.out.println(number2); 주석처리 컨트롤+쉬프트+c , 컨트롤 + 7
		
	}

}
