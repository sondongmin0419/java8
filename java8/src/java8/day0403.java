package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class day0403 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in); //���ڸ� �Է¹��� �� �ִ�,(���ڵ� ���ڷ� �ν�)
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Ű���带 ������ ���ڿ��� �Է��� �ּ���");
		String str = br.readLine();
		System.out.println(str);
		
		System.out.println("���� �Է��� �ּ���.");
		String number = br.readLine();
		int num1 = Integer.parseInt(number); //���ڿ��� ���ڷ� �����ϴ� �޼ҵ�
		System.out.println(number+10);
		System.out.println(num1+10);
		
		br.close();  //����� �������� �ݾ��ֱ�!!
		isr.close();
	}

}
