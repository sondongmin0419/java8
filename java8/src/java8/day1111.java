package java8;

public class day1111 {

	public static void main(String[] args) {
		int[][] arr=new int[9][9];
		
		for (int i=0;i<=8;i++)
		{
			for (int j=0;j<=8;j++)
			{
				arr[i][j]=(i+1)*(j+1);
				System.out.print((i+1)+"*"+(j+1)+"="+arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
