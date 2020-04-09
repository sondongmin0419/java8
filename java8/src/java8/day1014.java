package java8;

import java.util.Scanner;

public class day1014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] baseCom = new int[3];
		int[] baseUser = new int[3];
		int i = 0;
		int bolcnt = 0;
		int strcnt = 0;
		int outcnt = 0;
		int life = 10;
		while (i < 3) {
			baseCom[i] = (int) (Math.random() * 9) + 1;
			if (i > 0) {
				if (baseCom[i] == baseCom[i - 1]) {
					i = i - 1;
				}
			}
			if (i > 1) {
				if (baseCom[i] == baseCom[i - 2]) {
					i = i - 1;
				}
			}
			i++;
		}
		for (int j = 0; j < 3; j++) {
			System.out.print(baseCom[j] + " ");
		}
	//	do{
	//		user[0]=sc.nextInt();
	//	}while (
		
		
		
		System.out.println("숫자 야구게임을 시작합니다.");
		while (strcnt < 3) {
			bolcnt = 0;
			strcnt = 0;
			outcnt = 0;
			System.out.println("1~9까지중 숫자 3개를 차례로 입력하세요.");
			int r=0;
			for (int j = 0; j < 3; j++) 
			{
				baseUser[j] = sc.nextInt();
			}
			for (int j = 0; j < 3; j++) 
			{
				for (int k = 0; k < 3; k++) 
				{
					if (j == k) {
						if (baseCom[j] == baseUser[k]) 
						{
							strcnt++;
						}
					} else 
					{
						if (baseCom[j] == baseUser[k]) 
						{
							bolcnt++;
						}
					}
				}
			}
			outcnt = 3 - strcnt - bolcnt;
			System.out.print((11-life)+"회차 ");
			System.out.println("결과 : " + strcnt + "S " + bolcnt + "B " + outcnt + "O 입니다.");
			if (strcnt!=3) 
				life--;
			if (life==0)
			{
				System.out.println("기회가 모두 소진되었습니다. 게임을 종료합니다.");
				System.exit(0);
			}
		}
		System.out.println("축하합니다! 정답입니다!.");
		sc.close();
	}

}
