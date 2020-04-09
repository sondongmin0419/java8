package java8;

public class day1008 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		arr2[0] = 1.1;
		arr2[1] = 2.2;
		arr2[2]=3.3;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		boolean[] arr3 = new  boolean[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		arr3[0] = true;
		arr3[2]=true;
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		String[] arr4 =new String[3];
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println();
		
		arr4[0]="º½";
		arr4[1]="¿©¸§";
		arr4[2]="°¡À»";

		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}


}
