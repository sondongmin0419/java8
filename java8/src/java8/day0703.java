package java8;

public class day0703 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for (i = 1;i<=10;i++)
		{
			if (i%2==0)
				{sum+=i;
				}
		}
		System.out.println("1~10까지중 짝수의 합은 "+sum);
	}

}
