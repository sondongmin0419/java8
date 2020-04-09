package java8;

public class day1101 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int sum=0;
		for (int i=0;i<100;i++)
		{
			if (i%10==0)
				System.out.println();
			System.out.print(arr[i]+" ");
		}
		for (int i=0;i<100;i++)
		{
			if (i%10==0)
				System.out.println();
			if (i<9)
				System.out.print("0");
			arr[i]=i+1;
			sum +=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("1~100까지의 합 : "+sum);
		
	}

}
