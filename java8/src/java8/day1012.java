package java8;

import java.util.Arrays;
import java.util.Scanner;

public class day1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int max = 0;
		System.out.println(" 5���� ������ �Է¹޾� �ִ� ����ϱ�!.");

		System.out.println("�Է��� ����: ");
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
		System.out.println("�ִ� : "+max);
		
//		//�������� ���� ��������
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
		
		System.out.print("���� ���� ���� :");
		for (int i=0;i<5;i++)
		{
			System.out.print(nums[i]+" ");
		}
		
		
	}

}
