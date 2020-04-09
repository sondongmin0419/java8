package java8;

import java.util.Scanner;

public class day0901 {

	public static void main(String[] args) {
		/*1~100중 랜덤하게 정답을 설정.
		 * 정답보다 크면 up .정답보다 작으면 down
		 * 최대 횟수는 10회
		 * */
		int com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
//		System.out.println(com);
		int cnt=0;
		int user=0;
		long startTime = System.currentTimeMillis();
		while(cnt<10)
		{
		cnt++;
			do {
				System.out.println("1~100사이 정수를 입력하시오.");
				user = sc.nextInt();
			}while(user<1 || user>100);
		if (com>user)
		{
			System.out.println(cnt+"회차");
			System.out.println("더 큰 값입니다.");
		}
		else if (com==user)
		{
			System.out.println(cnt+"회차");
			
			long endTime=System.currentTimeMillis();
			double time = endTime -startTime;
			if (time<60000)
			{
			System.out.println("정답입니다!. 최종점수는 : "+(6000-(time/10.0))+"점 입니다.");
			System.exit(0);
			}
			else
			{
				System.out.println("시간초과입니다!. 점수는 0점입니다,");
			System.exit(0);
			}
		}
		else 
		{
			System.out.println(cnt+"회차");
			System.out.println("더 작은 값입니다.");
		}
		System.out.println("");
		}
		long endTime=System.currentTimeMillis();
		double time = endTime -startTime;
		System.out.println("프로그램이 종료됩니다.");
	}

}
