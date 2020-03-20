package java8;

import java.util.Random;

public class day0507 {

	public static void main(String[] args) {
		Random rd = new Random();
		int now = rd.nextInt(4)+9;
		System.out.println("현재시간은 "+now+"시 입니다.");
		System.out.println("남은 일과");
		
		switch(now)
		{
		case 9:
			System.out.println("9시에 출근");
		case 10:
			System.out.println("10시에 회의");
		case 11:
			System.out.println("11시 업무처리");
		case 12:
			System.out.println("12시 점심시간");
		}
		
	}

}
