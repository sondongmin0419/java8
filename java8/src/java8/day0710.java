package java8;

public class day0710 {

	public static void main(String[] args) {
		double avg=0;
		int sum=0;

		for (int i =1;i<=50;i++)
		{
			sum +=i;
			avg = (double)sum/i;
			System.out.println("1���� "+i+"������ �� = "+sum+", ��� = "+avg);
		}
	}

}
