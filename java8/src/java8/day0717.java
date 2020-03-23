package java8;

import java.util.Scanner;

public class day0717 {

	public static void main(String[] args) {
		int life = 3;
		int score = 0;
		while (life > 0) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("가위, 바위, 보 중 하나를 고르시오. (a=가위,b=바위,c=보,q=종료)");
			String user = sc.next();
			int user_num = 0;
			int com_num = (int) (Math.random() * 3) + 1;
			String com = "";
			
			switch (com_num) {
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;
			}

			switch (user) {
			case "a":
			case "A":
				System.out.println("유저 :가위를 선택하셨습니다.");
				System.out.println("컴퓨터는 " + com + "를 선택했습니다.");
				user_num = 1;
				break;
			case "b":
			case "B":
				System.out.println("유저 :바위를 선택하셨습니다.");
				System.out.println("컴퓨터는 " + com + "를 선택했습니다.");
				user_num = 2;
				break;
			case "c":
			case "C":
				System.out.println("유저 :보를 선택하셨습니다.");
				System.out.println("컴퓨터는 " + com + "를 선택했습니다.");
				user_num = 3;
				break;
			case "q":
			case "Q":
				System.out.println("게임이 종료되었습니다. 총 score = "+score );
				System.exit(0);
			}
			if (user_num - com_num == 0) {
				score += 10;
				System.out.println("비겼습니다. 현재 LIFE : " + life + ", Score = " + score);

			} else if ((user_num - com_num == 1) ||  (user_num- com_num ==-2)) {
				score += 100;
				System.out.println("유저가 이겼습니다. 현재 LIFE : " + life + ", Score = " + score);
			} else 
				life -= 1;
				System.out.println("컴퓨터가 이겼습니다. 현재 LIFE : " + life + ", Score = " + score);
			}
		System.out.println("게임이 종료되었습니다. 총 score = "+score );
		}
}