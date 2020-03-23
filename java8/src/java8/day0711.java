package java8;

public class day0711 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if (i%3 ==0)
			{
				System.out.print(i+" PING");
				if (i%5==0)
				{
					System.out.print(" PONG");
				}
				System.out.println("");
			}
			else if(i%5==0)
			{
				System.out.println(i+" PONG");
			}
			else
			{
				System.out.println(i);
			}
			
			for (int j=1;i<=100;i++)
			{
				System.out.print(i+" ");
				System.out.println();
			}
		}
	}

}
