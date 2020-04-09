import java.util.Arrays;


class Solution {
    public int[] solution(int[] answers) {
		int length = answers.length;
        int[] a = new int[length];
        int[] b = new int[length];
        int[] c = new int[length];
        int[] ex = {1,3,4,5};

        int cnta=0;
        int cntb=0;
        int cntc=0;
        int e=0;

        String str1="1";
        
        for (int i=0;i<length;i++)
        {
            if (i>4)
            {
                a[i]=a[i-4];
            }
            else
            {
                a[i]=i+1;
            }
            
            if(i%2==0)
            {
                b[i]=2;
            }
            else
            {
                b[i]=ex[e];
                e++;
                if (e>3)
                    e=0;
            }
            
            if (i<2)
            {
                c[i]=3;
            }
            else if(i<4)
            {
                c[i]=1;
            }
            else if(i<6)
            {
                c[i]=2;
            }
            else if(i<8)
            {
                c[i]=4;
            }
            else if (i<10)
            {
                c[i]=5;
            }
            else
            {
                c[i]=c[i-10];
            }
            
            if (a[i]==answers[i])
                cnta++;
            if (b[i]==answers[i])
                cntb++;
            if (c[i]==answers[i])
                cntc++;    
        }
        System.out.println(cnta);
        System.out.println(cntb);
        System.out.println(cntc);
        
        if (cnta>cntb && cnta>cntc)
        {
        	str1 = str1.replaceAll("a", "1");    
        }
        else if(cntb>cnta && cntb>cntc)
        {
        	str1 = str1.replaceAll("a", "2");        
        }
        else if(cntc>cnta && cntc>cntb)
        {
        	str1 = str1.replaceAll("a", "3");        
        }
        else if(cnta==cntb && cnta>cntc)
        {
        	str1 = str1.replaceAll("a", "1,2");        
        }
        else if(cnta==cntc && cnta>cntb)
        {
        	str1 = str1.replaceAll("a", "1,3");        
        }
        else if(cntb==cntc && cntb>cnta)
        {
        	str1 = str1.replaceAll("a", "2,3");        
        }
        else if(cnta==cntb && cntb==cntc)
        {
        	str1 = str1.replaceAll("a", "1,2,3");        
        }
        String answer = Arrays.toString(str1.toCharArray());
        return answer;
    }
}