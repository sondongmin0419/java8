package java8;

public class day1005 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
//		arr1 = {100,200,300,400,500} 이건 불가능
		int[] arr2 = new int[5];
//		arr2 = {10,20,30,40,50} 이것도 불가능
		
		int[] arr3 = new int[] {10,20,30,40,50}; //크기가 5인 배열 
//		arr3 = {100,200,300,400,500}; 안됨
		
		String str1="안녕하세요";
		System.out.println(str1);
		str1 = "Hello";
		System.out.println(str1); //동일한 형태의 다른객체를 입력할 수 있다.
		
		arr3=new int[] {100,200,300,400,500}; //배열도 동일한 형태의 다른 객체를 대입할 수있다.
		
		for (int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		arr2 = new int[10]; //새로운 배열을 생성하는 개념.
		
		System.out.println(str1.length());
		
	}

}
