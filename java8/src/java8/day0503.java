package java8;

import java.util.Scanner;

public class day0503 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 영어 점수를 입력해 주세요(0~100)");
		
		int score = sc.nextInt();
				
		String glade = "";
		
		if(score >= 90)
		{
			glade = "A학점";
		}
		else if (score >=80)
		{
			glade = "B학점";
		}
		else if (score >=70)
		{
			glade = "C학점";
		}
		else if (score >=60)
		{
			glade = "D학점";
		}
		else 
		{
			glade = "F학점";
		}
		
		System.out.println("제 학점은 "+glade+" 입니다");
		
		sc.close();
		
		}
}
/*
 * 90점이상 A
 * 80점이상 B
 * 70점이상 C
 * 60점이상 D
 * 60미만 F
 */
