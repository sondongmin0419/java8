package java04;

public class Computer {
	int sum(int[] arr) {
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		return sum;
	}
	
	int sum2(int... arr) {
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		return sum;
	}

}
