package java8;

public class day1005 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
//		arr1 = {100,200,300,400,500} �̰� �Ұ���
		int[] arr2 = new int[5];
//		arr2 = {10,20,30,40,50} �̰͵� �Ұ���
		
		int[] arr3 = new int[] {10,20,30,40,50}; //ũ�Ⱑ 5�� �迭 
//		arr3 = {100,200,300,400,500}; �ȵ�
		
		String str1="�ȳ��ϼ���";
		System.out.println(str1);
		str1 = "Hello";
		System.out.println(str1); //������ ������ �ٸ���ü�� �Է��� �� �ִ�.
		
		arr3=new int[] {100,200,300,400,500}; //�迭�� ������ ������ �ٸ� ��ü�� ������ ���ִ�.
		
		for (int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		arr2 = new int[10]; //���ο� �迭�� �����ϴ� ����.
		
		System.out.println(str1.length());
		
	}

}
