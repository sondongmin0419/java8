package java8;

public class day0602 {

	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		
		for (i=1;i<=100;i++)
		{
			sum +=i;
			System.out.println("현재 i 의 값 :"+i);
			System.out.println("현재 sum의 값 :"+sum);
		}
		System.out.println("1부터 100까지의 합 : "+sum);
		System.out.println("끝난뒤 i 의 값 : "+i);
	}

}
