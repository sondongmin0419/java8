package day16;

public class ThrowsExm {
	
	public static void calc1() throws ArithmeticException{
		calc2();
	}
	public static void calc2() throws ArithmeticException{
		int num = 5/0;
	}
	public static void mian(String[] args) {
		System.out.println("메소드에서 던지는 예외알리기");
		try {
			calc1();
			
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("메소드에서 던지는 예외알리기 프로그램 종료.");
		}
	}
	public static void calc3() throws InterruptedException {
		Thread.sleep(1000);
	}}
