package java8;

public class day1104 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num=0;
		for (int i =0;i<5;i++)
		{
			if (i%2==0)
			{
				for (int j=0;j<5;j++)
				{
					num++;
					arr[i][j]=num;		
				}
			}
			else
			{
				for (int j=4;j>=0;j--)
				{
					num++;
					arr[i][j]=num;
				}
			}
		}
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
