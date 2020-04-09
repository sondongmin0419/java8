package java04;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		int res1 = cal.plus(10,20);
		System.out.println(res1);
		
		byte num1 = 10;
		byte num2 = 3;
		double  res2 = cal.divide(num1, num2); 
		System.out.println(res2);
		
		long num3 = 100;
		long num4 = 30;
		double res3 = cal.plus(num3, num4);  
		System.out.println(res3);
	}

}
