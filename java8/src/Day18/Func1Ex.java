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
		
		Func1 func2 = (int number)-> {//���ٽ�
			System.out.println(number);
		};
		func2.method(100);
		Func1 func3 = (number)-> {System.out.println(number);};
		func2.method(100);
		Func1 func4 = number-> System.out.println(number);
		func2.method(100);
		Func1 func5 = x->System.out.println(x); //�Ű��������� ������ �� �ִ�.
		func2.method(1000);
	}

}
