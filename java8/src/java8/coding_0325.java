package java8;

public class coding_0325 {

	public int[] solution(int n) {

		int k = ((int) Math.pow(2, n)) - 1;

		int[] answer = new int[k];

		answer[k / 2 + 1] = 0;
		for (int i = 0; i < k / 2 + 1; i++) 
		{
			if (answer[k / 2 + 1 - i] == 0) 
			{
				answer[k/2+1-i]
			}
		}

		return answer;
	}
} 
// 1 2 4 8 
//int n=3;
//int k =(int)Math.pow(2, n)-1;
//int[] answer = new int[k]; 
//answer[0]= 0;
//
// for (int i=1;i<k/2+1;i=i+2)
//  {
//	 answer[1]=0;
//	 if (answer[i-1]==0)
//     {
//         answer[i+1]=1;
//         answer[k-i-1]=0;
//     }
//     else
//     {
//         answer[i+1]=0;
//         answer[k-i-1]=1;
//     }