package java04;

public class ComputerEx {

	public static void main(String[] args) {
		Computer com = new Computer();
		int[] arr1 = {10,20,30};
		int res1 = com.sum(arr1);
		System.out.println(res1);
		
		int res2 = com.sum(new int[] {10,20,30,40,50});
		System.out.println(res2);
		
		int res3 = com.sum2(arr1);
		System.out.println(res3);
		
		int res4 = com.sum2(10,20,30,40,50);
		System.out.println(res4);

//		int res5 = com.sum(10,20,30,40,50); 이건 안됨 가변형일경우만 됨
//		System.out.println(res4);
		
	}

}
