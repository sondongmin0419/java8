package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		//스캐너 생성
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
//		luck = (int)Math.random()*51; 이렇게도 가능
		
		//사용자의 이름을 입력받습니다.
		System.out.print("이름을 입력해 주세요.");
		String name = sc.next();
		int lucky = 0;
		lucky = rd.nextInt(101);
		//오늘의 운세를 출력
		System.out.println(name + "님의 오늘의 행운은");
		String str = "%d입니다."; //String형에는 문자열을 저장할 수 있습니다.
								  //String형은 참조형으로 그 값이 저장되는 것이 아니라
								  //값이 가지고 있는 메모리 주소가 저장됩니다.
								  //작은따옴표로 감싸묜 char형이고 큰 따옴표로 감싸면 String형입니다.
								  //크기는 무한대
		System.out.println(lucky + str);  //0~100사이의 수를 출력
		//행운지수 50~100사이의 수를 출력하도록하기
//		lucky = rd.nextInt(51)+50;
		sc.close();
	}
}
