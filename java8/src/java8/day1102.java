package java8;

public class day1102 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=i;
			System.out.print(arr[i]+" ");
			arr[i]=0;
		}
		System.out.println(" ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
