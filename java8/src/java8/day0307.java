package java8;

public class day0307 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		a += b; // a = a + b
		System.out.println(a);
		a -= b; //a = a - b
		System.out.println(a);
		a *= b; // a = a * b
		System.out.println(a);
		a /= b; // a = a / b
		System.out.println(a);
		
		a *= 3 + 10;   // 대입연산자는 가장 마지막에 계산
		System.out.println(a);
		a += 1 ;
		System.out.println(a);
		a += 1 ;
		System.out.println(a);
		
	
	}

}
