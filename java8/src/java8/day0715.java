package java8;

public class day0715 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1;i<=100;i++)
		{
			if (i%5==0)
			{
			sum +=i;
			}
		}
		System.out.println(sum);
		System.out.println();
		for (int i=1;i<=50;i++)
		{
			if (i%3==0)
				System.out.println(i);
		}
		
		int sum3=0;
		int cnt=0;
		for (int i=1;i<=50;i++)
		{
			if (i%3==0)
			{
				sum +=i;
				cnt++;
			}
		}
		System.out.println("1~50�� 3�� ����� ������ "+sum+"�̰�, ������ "+cnt+"�Դϴ�");
	}

}
