package Day18;

public class Func1Ex {

	public static void main(String[] args) {
		Func1 func1 = new Func1() {

			@Override
			public void method(int number) {
				System.out.println(number);
				
			}
			
		};
		func1.method(10);
		
		Func1 func2 = (int number)-> {//람다식
			System.out.println(number);
		};
		func2.method(100);
		Func1 func3 = (number)-> {System.out.println(number);};
		func2.method(100);
		Func1 func4 = number-> System.out.println(number);
		func2.method(100);
		Func1 func5 = x->System.out.println(x); //매개변수명을 변경할 수 있다.
		func2.method(1000);
	}

}
