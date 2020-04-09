package Programers;

public class Solution002 {
	public String solution(String s, int n) {
		char[] chArr = s.toCharArray();
		int clength = chArr.length;
		for (int i = 0; i < clength; i++)
		{

			if (chArr[i] >= 'a' && chArr[i] <= 'z')
			{
				chArr[i] = (char) (chArr[i] + n);
			}
			do {
				if (chArr[i]>'z')
					chArr[i] = (char)(chArr[i]-26);
			}while(chArr[i]>'z');
			
			if (chArr[i] >= 'A' && chArr[i] <= 'Z')
			{
				chArr[i] = (char) (chArr[i] + n);
			}
			do {
				if (chArr[i]>'Z')
					chArr[i] = (char)(chArr[i]-26);
			}while(chArr[i]>'Z');
			
		}
		String answer = new String(chArr);

		return answer;
	}
}

//String str = "hello";
//char[] chArr = str.toCharArray();