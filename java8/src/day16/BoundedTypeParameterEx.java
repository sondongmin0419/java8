package day16;

public class BoundedTypeParameterEx {

	public static void main(String[] args) {
		int result1 = Util.compare(10, 20); //t1�� t2�� int�̹Ƿ� Integer�� ���߰���
		System.out.println(result1); //-1
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2); //1
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);
	}

}
