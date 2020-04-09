package java8;

public class day0905 {

	public static void main(String[] args) {
		for (int i=0;i<26;i++)
		{
			System.out.printf("%c, ",i+65);
		}
		System.out.println("");
		
		for (int i=0;i<26;i++)
		{
			System.out.printf("%c, ",i+97);
		}
		System.out.println("");
		
		for (int i='a';i<='z';i++)
		{
			System.out.printf("%c, ",i);
		}
	}

}
//System.out.printf() 는 형식 (format)에 맞게 출력하는 메소드입니다.
//printf는 c언어에서 출력으로 사용하는 메소드인데 자바에서도 사용할 수 있습니다.
//첫번째 인수(입력값)는 출력 형식을 입력하고
//두번째부터는 출력형식에 대입할 변수를 입력합니다.

//형식의 시작은 %로 시작합니다.
//d:decimal 십진수
//f:float 실수
//lf: long float -> double
//o : octa 8진수
//x : hexa 16진수
//b:binary 2진수
//s:string 문자열
//c:char 문자 1개

//조합할 수 있는 것
/*앞쪽에 숫자를 입력하면 자리수를 뜻함
* %2d ->십진수로 2자리 출력 
* 숫자앞에 0을붙이면 빈공간을 0으로 채운다.
*/