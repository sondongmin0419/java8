package Chapter13;

import java.io.*;
public class IStreamReader {

	static String fname;
	public static void main(String[] args) {
		int idata = -1;
		//BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
		Reader isr=new InputStreamReader(System.in); //��
		System.out.println("Ű���忡�� �����Է�[�������� ����]"); 
		System.out.println("---------------------------");
		
		try {  //��
			while(true) {
				idata = isr.read(); //��
				if(idata == -1) //��
					break;
				System.out.print((char)idata); //��
			}
		}catch(IOException e) {
			System.out.println(e.toString()); 
		}
	}
} 