package java8;

import java.io.*;

public class day0405_example {

	public static void main(String[] args) throws Exception{
		int intnum;
		double dblnum;
		//Scanner sc = new Scanner(System.in);
		BufferedReader inbr = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("������ �Ǽ��� �Է��ϼ���! : ");
		intnum = Integer.parseInt(inbr.readLine());
		dblnum = Double.parseDouble(inbr.readLine());
		System.out.println("�Է��� ������ "+ intnum + "�Դϴ�.");
		System.out.println("�Է��� �Ǽ��� "+ dblnum + "�Դϴ�.");
		
	}

}
