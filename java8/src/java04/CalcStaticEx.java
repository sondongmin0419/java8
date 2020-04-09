package java04;

public class CalcStaticEx {

	public static void main(String[] args) {
		double result1 = 10*10 * CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		
		CalcStatic calcs = new CalcStatic();
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		System.out.println("calcs.pi:"+calcs.pi);

		System.out.println(CalcStatic.number);
		CalcStatic.number = 100;
		System.out.println(CalcStatic.number);
		System.out.println(calcs.number);
	}

}
