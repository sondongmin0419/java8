package java8;

import java.util.Arrays;

public class exmaple03277 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		int dRleng = dartResult.length();
		char[] cdart = new char[dRleng];
		for (int i=0;i<dRleng;i++)
		{
			cdart[i]=dartResult.charAt(i);
		}
		System.out.println(cdart);
		int[] cutd = new int [3];
		int[] cutt = new int [3];
		int cntd=0;
		int cntt=0;
		for (int i=0;i<dRleng;i++)
		{
			if (cdart[i]=='S' || cdart[i]=='D' || cdart[i]=='T')
			{
				cutd[cntd]=i;
				cntd++;
			}
		}
		for (int i=0;i<dRleng;i++)
		{
			if (cdart[i]=='#' || cdart[i]=='*')
			{
				cutt[cntt]=i;
				cntt++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
//		String cdart;
//		cdart2[0] = dartResult.charAt(0);
//		cdart = Arrays.toString(dartResult.toCharArray());
//		System.out.println(dartResult);
//		System.out.println(cdart);
//		System.out.println(cdart2[0]);
		

	}

}

//1	1S2D*3T		37		1^1 * 2 + 2^2 * 2 + 3^3
//2	1D2S#10S	9		1^2 + 2^1 * (-1) + 10^1
//3	1D2S0T		3		1^2 + 2^1 + 0^3
//4	1S*2T*3S	23		1^1 * 2 * 2 + 2^3 * 2 + 3^1
//5	1D#2S*3S	5		1^2 * (-1) * 2 + 2^1 * 2 + 3^1
//6	1T2D3D#		-4		1^3 + 2^2 + 3^2 * (-1)
//7	1D2S3T*		59		1^2 + 2^1 * 2 + 3^3 * 2