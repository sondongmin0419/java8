package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day0408_example {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in); //문자만 입력받을 수 있다,(숫자도 문자로 인식)
		BufferedReader br = new BufferedReader(isr);
		
		double pi = 3.14159;
		System.out.println("반지름의 길이를 입력하시오.");
		
		String number = br.readLine();
		int r = Integer.parseInt(number);
		double cy = 2*pi*r;
		System.out.println("원주는 :  ");
		System.out.println(cy+"입니다.");
		
		
	}

}
