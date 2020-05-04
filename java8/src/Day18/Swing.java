package Day18;

import java.util.Scanner;

import java.util.Random;


public class Swing{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int user;

		int com;

		Random r = new Random();

		com = (r.nextInt() >>> 1) % 3;// 정수의 범위 내에서 임의로 수를 만들어줌

		System.out.print("가위[0], 바위[1], 보[2]를 선택하시오==>");

		user = sc.nextInt();

		// 컴퓨터가 발생한 숫자에 따라 가위,바위, 보 문자열 설정

		// 사용자가 입력한 숫자에 따라 가위,바위, 보 문자열 설정

		// 이와같이 똑같은 코드를 반복해서 쓰일 경우

		// ==> 그 일처리를 위한 기능을 미리 만들어 두면

		// 반복코드를 줄일 수 있다. == '메소드' 라고 한다

		System.out.println("컴퓨터 : " + resultString(com));

		System.out.println("사용자 : " + resultString(user));

		if (user == com) // 비긴거

			System.out.println("비겼습니다.");

		else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1))

			// 위에 else if 는 사용자가 이기는 컨디션

			System.out.println("당신이 이겼습니다.");

		else // 진거

			System.out.println("당신이 졌습니다.");

		sc.close();
	}

	public static String resultString(int n) {

		String r = "";

		if (n == 0)

			r = "가위";

		else if (n == 1)

			r = "바위";

		else

			r = "보";

		return r;

	}
}
