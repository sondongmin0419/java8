package day15;

import java.io.*;
import java.util.Scanner;

public class Hangman {
	private int failed;
	private String hiddenString;
	private	StringBuffer outputString;
	private StringBuffer inputString;
	private int remainder;
	private Scanner sc;
	private String inputData;
	
	public Hangman() {
		this("hello");
	}
	
	public Hangman() {
		hiddenString = "hello"; //�����ʱ�ȭ

		//�ʱ�ȭ �ڵ� �߰�
		inputString =new StringBuffer();
		outputString=new StringBuffer();
		remainder=hiddenString.length();
		failed = 0;
		inputData="";
		sc = new Scanner(System.in);
		
		for (int i=0;i<remainder;i++)
		{
			
		}
		
		
	}public Hangman(String solution) {
		hiddenString = "hello"; //�����ʱ�ȭ
		
		//�ʱ�ȭ �ڵ� �߰�
		inputString =new StringBuffer();
		outputString=new StringBuffer();
		remainder=hiddenString.length();
		failed = 0;
		inputData="";
		sc = new Scanner(System.in);
		
		for (int i=0;i<remainder;i++)
		{
			outputString.append("_");
		}
		
		
	}
	public void playGame() {
		System.out.println("��� ������ �����մϴ�.");
		show();
		do {
		do {
		setintputData();
		}while(checkChar(inputData));
		processGame();
		show();
		}while(failed<6 && remainder>0);
		
		
		System.out.println("��� ������ �����մϴ�,");
	}
	
	private void show() {
		System.out.println("Ʋ�� Ƚ�� : "+failed+"/6");
		System.out.println(outputString);
		
		
	}
	private void setintputData() {
		System.out.println("���ڸ� �Է����ּ���");
		this.inputData = sc.next().substring(0,1);
		
	}
	private boolean checkChar(String inputData) {
		if (inputString.indexOf(inputData)==-1)
		{
			inputString.append(inputData);
			return false;
		}
		else
		{
			System.out.println("�̹� �Է��� �����Դϴ�. �ٽ��Է����ּ���.");
			return true;
		}
	}
	private void processGame() {
		if (hiddenString.indexOf(inputData)==-1) {
			failed++;
		}
		else{
			int index = hiddenString.indexOf(inputData);
			do {
			outputString.setCharAt(index, inputData.charAt(0));
			remainder--;
			index = hiddenString.indexOf(inputData,index+1);
			}while(index !=-1);
		}
	}
}
