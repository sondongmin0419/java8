package java8;

import java.io.*;

public class day0404_example {

	public static void main(String[] args) throws Exception{
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("년도를 입력하세요! :");
		number = Integer.parseInt(inbr.readLine());
		System.out.println("입력한 년도는 "+number+"년입니다.");
		
	}

}
