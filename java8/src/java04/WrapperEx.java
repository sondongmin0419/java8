package java04;

public class WrapperEx {

	public static void main(String[] args) {
		int number = 10;
		//�ڽ�
		Integer iBox = new Integer(number); //�Ű������� �⺻�� �Ǵ� ���ڿ��� �Է��� �� �ִ�.
		Integer iBox2 = Integer.valueOf(number);
		//��ڽ�
		number = iBox.intValue();
		
		//�ڵ� �ڽ�
		Integer iBox3 = number;
		
		//�ڵ� ��ڽ�
		int res = iBox3+10;
		System.out.println(res);
		
	}

}
