package java8;

public class day0903 {

	public static void main(String[] args) {
		/*1부터 25까지 5칸 5줄 출력
		 */
//		int cnt=-4;
//		for (int i=1;i<=5;i++)
//		{
//			if (i%2==1)
//				cnt=cnt+5;
//			for (int j=0;j<=4;j++)
//			{
//				if (i%2==1)
//					System.out.print(cnt++ +"\t");
//				else 
//				{
//					System.out.print(cnt+4-j+"\t");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if (i==j)
					System.out.print("@");
				else 
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
