package Chapter13;

import java.io.*;
public class IStreamReader {

	static String fname;
	public static void main(String[] args) {
		int idata = -1;
		//BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
		Reader isr=new InputStreamReader(System.in); //①
		System.out.println("키보드에서 문자입력[마지막에 엔터]"); 
		System.out.println("---------------------------");
		
		try {  //②
			while(true) {
				idata = isr.read(); //③
				if(idata == -1) //④
					break;
				System.out.print((char)idata); //⑤
			}
		}catch(IOException e) {
			System.out.println(e.toString()); 
		}
	}
} 