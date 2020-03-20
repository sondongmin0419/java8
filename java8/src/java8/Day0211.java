/** 컨트롤 + space //자동완성
 *  컨트롤+ 쉬프트 +c //그 줄 주석처리
 *  컨트롤 + L //가고싶은줄로 갈수있음.
 *  컨트롤 위아래 방향키 //화면이동.
 *  컨트롤 좌우 방향키 //한단어씩 커서 이동.
 *  컨트롤 + d //한줄삭제
 *  쉬프트 + 알트 + a //세로로 여러줄 동시 편집.
 *   */


package java8;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A'+'1';  //A는 65, '1'은 49 , 114번은 r이됨.
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str = "A"+"1"; //문자열은 아무것도없거나 한 개의 문자만 있어도 쌍따옴표로 감싸면 문자열
		System.out.println(str); //문자열의 덧셈은 하나의 문자열로 합치게 됩니다.
		String str2 = "10";
		int num2 = 10;
		String res2 = str2 + num2; //문자열과 다른 자료형이 합치게 되면 하나의 문자열이 됩니다.
		
		System.out.println(res2);
		
		int num3 = 10;
		int num4 = 20; //int는 integer의 약어
		System.out.println(""+num3 + num4); //숫자를 문자로 변형하는 방법1
//		String str3 = num3 + ""; //편법
		//String str3 = String.valueOf(num3); //숫자를 문자로 변형하는방법 2
		
		String str4 = "100";
		System.out.println(str4 + 100);
		
		int num5 = Integer.valueOf(str4);
		System.out.println(num5 + 100);
		
		//int num6 = Integer.parseInt(str4);
	//	double d2 = Double.parseDouble(str4);
		
		//String str5 = "Hello";
//		int num7 = Integer.valueOf(str5);
//		int num7 = Integer.parseInt(str5);
		
		//System.out.println(num7);
		
		
		
	
	}

}


/*
 * number1;
 * number2;
 * number3;
 * number4;
 * number5;
 * number6;
 *    ber
 */
