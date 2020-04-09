package java8;

public class day1105 {

	public static void main(String[] args) {
		//1~45를 입력한 배열을 작성.
		int[] arr = new int[45];
		for (int i =0;i<45;i++)
		{
			arr[i]=i+1;
			System.out.print(arr[i]+"\t");
			if ((i+1)%5==0)
				System.out.println();
		}
		
		System.out.println("섞은후");
		
		int temp;
		int k,l;
		for (int i =0;i<10000;i++)
		{
			k = (int)(Math.random()*45);
			l = (int)(Math.random()*45);

			temp=arr[k];
			arr[k]=arr[l];
			arr[l]=temp;
		}
		
		for (int i =0;i<7;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		int[] arr2 = new int[7];
		System.out.println();
		System.out.println();
		for (int i=0;i<7;i++)
		{
			for (int j=i;j<7;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			arr2[i]=arr[i];
			System.out.print(arr2[i]+"\t");
		}
	}

}
