package java8;

public class dat0401 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		int res1 = a <<2;
		
		//��Ʈ �̵� ������
		System.out.println(res1);
		
		int res2 = a>>1;
		System.out.println(res2);
		
		int res3 = a>>2;
		System.out.println(res3);
		
		int res4 = ~b;
		System.out.println(res4);
		
		int res5 = res4 << 1;
		System.out.println(res5);
		
		int res6 = res5>>1;
		System.out.println(res6);
		
		int res7 = res4 >>>1;
		System.out.println(res7);
		
		//��Ʈ��������
		int res8 = a&b ;//��Ʈ �� �����ڴ� ��ȣ�� �ϳ��� ���
						//a= 0011
						//b= 0101
						//&->0001
		
		System.out.println(res8);
		
		int res9 = a|b; //a= 0011
						//b= 0101
		                //|->0111
		System.out.println(res9);
		
		int res10 = a^b;
		System.out.println(res10); 
		
	}

}
