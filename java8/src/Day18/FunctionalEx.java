package Day18;

public class FunctionalEx {

	public static void main(String[] args) {
		Functional f1 = new Functional() {

			@Override
			public void method() {
				System.out.println("f1 �͸�����ü�� �޼ҵ� ȣ��");
			}

			};
			f1.method();
			
			Functional f2 = ()->{
				System.out.println("f2 ���ٽ����� �޼ҵ� ȣ��");
			};
			f2.method();
			
			Functional f3 = () ->System.out.println("f3 ���ٽ����� �޼ҵ� ȣ��");
			f3.method();

	}

}
