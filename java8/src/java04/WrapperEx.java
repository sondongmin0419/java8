package java04;

public class WrapperEx {

	public static void main(String[] args) {
		int number = 10;
		//박싱
		Integer iBox = new Integer(number); //매개변수는 기본값 또는 문자열을 입력할 수 있다.
		Integer iBox2 = Integer.valueOf(number);
		//언박싱
		number = iBox.intValue();
		
		//자동 박싱
		Integer iBox3 = number;
		
		//자동 언박싱
		int res = iBox3+10;
		System.out.println(res);
		
	}

}
