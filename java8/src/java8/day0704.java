package java8;

public class day0704 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<=50;i++)
		{
			if (i%3==0)
				sum+=i;
		}
		System.out.println("1~50������ ���� 3�ǹ���� ���� "+sum);
	}

}
