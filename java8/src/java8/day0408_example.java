package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day0408_example {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in); //���ڸ� �Է¹��� �� �ִ�,(���ڵ� ���ڷ� �ν�)
		BufferedReader br = new BufferedReader(isr);
		
		double pi = 3.14159;
		System.out.println("�������� ���̸� �Է��Ͻÿ�.");
		
		String number = br.readLine();
		int r = Integer.parseInt(number);
		double cy = 2*pi*r;
		System.out.println("���ִ� :  ");
		System.out.println(cy+"�Դϴ�.");
		
		
	}

}
