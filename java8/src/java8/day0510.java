package java8;

import java.util.Random;
import java.util.Scanner;

public class day0510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int com = (int)(Math.random()*3)+1;
		
		System.out.println(com);
		
		System.out.println("가위, 바위, 보 중 하나를 선택하세요.(가위: a , 바위: b , 보: c )");
		
		String user = sc.next();
		
		System.out.println(user);
		
		switch(user)
		{case "a":
			System.out.println("가위 선택");
			if(com==1)
			{
				System.out.println("유저 : 가위, 컴퓨터 :가위. 비겼습니다.!");
			}
			else if (com==2)	
			{
				System.out.println("유저 : 가위, 컴퓨터 :바위. 컴퓨터가 이겼습니다.");
			}
			else if (com==3)
			{
				System.out.println("유저 : 가위, 컴퓨터 : 보. 유저가 이겼습니다.!");
			}
			break;
		case "b":
			System.out.println("바위 선택");
			if(com==1)
			{
				System.out.println("유저 : 바위, 컴퓨터 :가위. 유저가 이겼습니다.!");
			}
			else if (com ==2)
			{
				System.out.println("유저 : 바위, 컴퓨터 :바위. 비겼습니다.!");
			}
			else if(com==3)
			{
				System.out.println("유저 : 바위, 컴퓨터 : 보. 컴퓨터가 이겼습니다.!");
			}
			break;
		case "c":
			System.out.println("보 선택");
			if(com==1)
			{
				System.out.println("유저 : 보, 컴퓨터 :가위. 컴퓨터가 이겼습니다.!");
			}
			else if (com==2)
			{
				System.out.println("유저 : 보, 컴퓨터 :바위. 유저가 이겼습니다.!");
			}
			else if(com==3)
			{
				System.out.println("유저 : 보, 컴퓨터 : 보. 비겼습니다.!");
			}
			
		}
	}

}
