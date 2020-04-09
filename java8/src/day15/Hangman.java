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
		hiddenString = "hello"; //정답초기화

		//초기화 코드 추가
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
		hiddenString = "hello"; //정답초기화
		
		//초기화 코드 추가
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
		System.out.println("행맨 게임을 시작합니다.");
		show();
		do {
		do {
		setintputData();
		}while(checkChar(inputData));
		processGame();
		show();
		}while(failed<6 && remainder>0);
		
		
		System.out.println("행맨 게임을 종료합니다,");
	}
	
	private void show() {
		System.out.println("틀린 횟수 : "+failed+"/6");
		System.out.println(outputString);
		
		
	}
	private void setintputData() {
		System.out.println("문자를 입력해주세요");
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
			System.out.println("이미 입력한 문자입니다. 다시입력해주세요.");
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
