package java8;

import java.util.Scanner;

public class day0503 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ���� ������ �Է��� �ּ���(0~100)");
		
		int score = sc.nextInt();
				
		String glade = "";
		
		if(score >= 90)
		{
			glade = "A����";
		}
		else if (score >=80)
		{
			glade = "B����";
		}
		else if (score >=70)
		{
			glade = "C����";
		}
		else if (score >=60)
		{
			glade = "D����";
		}
		else 
		{
			glade = "F����";
		}
		
		System.out.println("�� ������ "+glade+" �Դϴ�");
		
		sc.close();
		
		}
}
/*
 * 90���̻� A
 * 80���̻� B
 * 70���̻� C
 * 60���̻� D
 * 60�̸� F
 */
