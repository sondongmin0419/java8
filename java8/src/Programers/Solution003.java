package Programers;

import java.util.Arrays;

public class Solution003 {

    public int[] solution(int[] answers) {
    	int[] one = new int[answers.length];
    	int[] two = new int[answers.length];
    	int[] three = new int[answers.length];
    	
    	int cnt=0;
    	int cnt1=0;
    	int cnt2=0;
    	int cnt3=0;
    	
    	for (int i =0;i<answers.length;i++)
    	{
    		one[i]=i%5+1;
    		if (one[i]==answers[i])
    			{cnt1++;}
    		if (i%2==0)
    			{two[i]=2;}
    		else
    		{	if((cnt%5+1)!=2) {
    				two[i]=cnt%5+1;
        			cnt++;
    			}
    			else
    			{
    				cnt++;
    				two[i]=cnt%5+1;
    				cnt++;
    			}
    		}
    		if (two[i]==answers[i])
    			{cnt2++;}
    		if (i<=1){three[i]=3;}
    		else if (i<=3){three[i]=1;}
    		else if (i<=5){three[i]=2;}
    		else if (i<=7){three[i]=4;}
    		else if (i<=9){three[i]=5;}
    		else
    			{three[i]=three[i-10];}
    		if (three[i]==answers[i])
    			{cnt3++;}
    	}
    	int[] arr = new int[] {cnt1,cnt2,cnt3};
		Arrays.sort(arr);
		System.out.println(arr);
        int[] answert = new int[3];
        int ancnt=0;
		if (arr[2]==cnt1)
		{
			answert[ancnt]=1;
			ancnt++;
		}
		if(arr[2]==cnt2){
			answert[ancnt]=2;
			ancnt++;
		}
		if(arr[2]==cnt3){
			answert[ancnt]=3;
			ancnt++;
		}
    	int[] answer = new int[ancnt];
    	
    	for (int j=0;j<ancnt;j++) {
    		answer[j]=answert[j];
    	}
    	
        return answer;
    }
}
