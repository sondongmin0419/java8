package java8;

public class day0506 {

	public static void main(String[] args) {
		
		System.out.println("주사위 게임을 시작합니다.");
		
		int dice = (int)(Math.random()*6)+1;

		switch(dice)
		{
		case 1:
			System.out.println("주사위의 눈금은 "+dice+" 입니다");
			break;
		case 2:
			System.out.println("주사위의 눈금은 "+dice+" 입니다");
			break;
		case 3:
			System.out.println("주사위의 눈금은 "+dice+" 입니다");
			break;
		case 4:
			System.out.println("주사위의 눈금은 "+dice+" 입니다");
			break;
		case 5:
			System.out.println("주사위의 눈금은 "+dice+" 입니다");
			break;
		case 6:
			System.out.println("주사위의 눈금은 "+dice+" 입니다");
			break;
		}
		
	}

}
