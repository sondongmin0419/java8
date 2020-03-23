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
	}

}
