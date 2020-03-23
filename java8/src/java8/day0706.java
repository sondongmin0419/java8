package java8;

public class day0706 {

	public static void main(String[] args) {
		int cnt=0;
		
		for (int i=1;i<=50;i++)
		{
			if (i%3==0)
			{
				cnt++;
			}
		}
		System.out.println("1~50까지의 정수중 3의 배수의 개수는 "+cnt+"개 입니다.");
	}

}
