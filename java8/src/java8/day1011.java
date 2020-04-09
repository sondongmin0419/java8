package java8;

public class day1011 {

	public static void main(String[] args) {
		int[] arr = new int[100000000];
		
		System.out.println("C형 for문");
		int sum=0;
		long sTime = System.currentTimeMillis();
		for (int i = 0;i<arr.length;i++)
		{
			sum+=i;
//			System.out.println(arr[i]);
		}
		long eTime = System.currentTimeMillis();
		System.out.println(eTime-sTime+"ms");
		System.out.println();
		
		System.out.println("향상된 for문");
		int sum2=0;
		long sTime2 = System.currentTimeMillis();

		for (int number : arr)
		{
			sum2+=number;
//			System.out.println(number);
		}
		long eTime2 = System.currentTimeMillis();
		System.out.println(eTime2-sTime2+"ms");

		
	}

}
