package java8;

public class day0710 {

	public static void main(String[] args) {
		double avg=0;
		int sum=0;

		for (int i =1;i<=50;i++)
		{
			sum +=i;
			avg = (double)sum/i;
			System.out.println("1부터 "+i+"까지의 합 = "+sum+", 평균 = "+avg);
		}
	}

}
