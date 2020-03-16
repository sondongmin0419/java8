package java8;

public class day0309 {

	public static void main(String[] args) {
		int daegu = 2_000_000; //언더바 사용가능
		int global = 1_000_000;
		
		String str = daegu >= global ? "대구광역시" : "대구시" ; //비교문 ? A : B --> 비교문이 true 일땐 A 출력 false 일땐 B를 출력 
		
		System.out.println(str);
		double b = 10;
		double res11 = 0%b;
		System.out.println(res11);
		
	}

}
