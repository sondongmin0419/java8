package day16;

public class ArrayExceptionEx {
	public static void main(String[] args)  {
		exceptionTest();
	}
	static void exceptionTest() {
		int[] arr = new int[3];
		try {
		arr[2] = 100;
		System.out.println(arr[2]);
		throw new NullPointerException(); //���������� ���ܸ� �߻���Ű���� ��ü�� �����ؼ� throw �մϴ�.
		}catch(ArithmeticException e) {
			System.out.println("���� ������ �Ұ����մϴ�");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ �Ѿ ����� �� �����ϴ�.");
		}catch(Exception e) { //exception �� ���失 �������� ����ؾ���.
			System.out.println("�߻��� ��� ���ܸ� ó���մϴ�.");
			e.printStackTrace();
		}finally { //���ܿ� ������� ������ �����ϴ� ����.
			System.out.println("finally �����Դϴ�");
		}
		
		
	}
}
