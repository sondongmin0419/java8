package java8;

public class day1103 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		for (int i=2;i<10;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		for (int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
