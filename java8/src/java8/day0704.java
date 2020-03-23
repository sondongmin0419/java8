package java8;

public class day0704 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<=50;i++)
		{
			if (i%3==0)
				sum+=i;
		}
		System.out.println("1~50까지의 수중 3의배수의 합은 "+sum);
	}

}
