package java8;

public class day1002 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int arr2[] = { 60, 70, 80, 90, 100 };

		for (int i = 0; i < 5; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		arr1[2]=300;
		for (int i = 0; i < 5; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		int[] arr3 = {1,2,3,4,5,6,7,8};
		for (int i=0;i<8;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
	}

}
