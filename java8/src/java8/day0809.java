package java8;

import java.util.Scanner;

public class day0809 {

	public static void main(String[] args) {
//		프로그램이 가지고있는 정수를 사용자가 알아맞히는 게임
//		사용자가 답을 제시하면 프로그램은 자신이 저장한 정수와 비교하여 제시된 정수가 더 높은지 낮은지 만을 알려준다,
		int com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
//		System.out.println(com);
		while(true)
		{
		System.out.println("1~100사이 정수를 입력하시오.");
		int user = sc.nextInt();
		if (com>user)
		{
			System.out.println("더 큰 값입니다.");
		}
		else if (com==user)
		{
			System.out.println("정답입니다!.");
			System.exit(0);
		}
		else 
		{
			System.out.println("더 작은 값입니다.");
		}
		System.out.println("");
		}
		
	}

}
