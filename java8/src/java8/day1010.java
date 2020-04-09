package java8;

import java.util.Arrays;

public class day1010 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1;
		System.out.println(num2);
		String str1 = "Hello";
		String str2 = str1;
		System.out.println(str2);
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = arr1; // 원래 프로그램에서 불가능. 자바에서는 예외로 사용가능
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("");

		int[] arr3 = new int[5];
		System.arraycopy(arr1, 1, arr3, 3, 2);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		int[] arr4 = Arrays.copyOf(arr1, arr1.length);

		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		
	}

}
