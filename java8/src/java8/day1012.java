package java8;

import java.util.Arrays;
import java.util.Scanner;

public class day1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int max = 0;
		System.out.println(" 5개의 정수를 입력받아 최댓값 출력하기!.");

		System.out.println("입력한 정수: ");
		for (int i=0;i<5;i++)
		{
			nums[i]=sc.nextInt();
			System.out.print(nums[i]+" ");
		}
		for (int i=0;i<5;i++)
		{
			if (nums[i]>max)
				max = nums[i];
		}
		System.out.println("최댓값 : "+max);
		
//		//오름차순 정렬 버블정렬
//		for (int i=0;i<5;i++)
//		{
//			for (int j=i+1;j<5;j++)
//			{
//				if (nums[i]>nums[j])
//				{	
//					int temp;
//					temp = nums[i];
//					nums[i]=nums[j];
//					nums[j]=temp;
//				}
//			}
//		}
		Arrays.sort(nums);
		
		System.out.print("오름 차순 정렬 :");
		for (int i=0;i<5;i++)
		{
			System.out.print(nums[i]+" ");
		}
		
		
	}

}
