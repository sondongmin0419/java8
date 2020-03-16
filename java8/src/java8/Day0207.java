package java8;

import java.util.*;

public class Day0207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 작성방법
		Random rd = new Random();  //Random은 매개변수(입력값)가 없습니다.
		System.out.println(rd.nextInt());
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextLong());
		System.out.println(rd.nextGaussian());
		System.out.println(rd.nextInt(10));
		
		System.out.println(Math.random());
		
	}

}
