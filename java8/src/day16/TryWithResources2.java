//package day16;
//
//import java.io.File;
//import java.util.Scanner;
//
//import day15.MainEx;
//
//public class TryWithResources2 {
//	public void getData(String file)
//	{
//		try {
//			Scanner sc = new Scanner(new File(file));
//			Scanner sc2 = new Scanner(System.in); //여러개의 자동 닫힘 소스르 작성할 수 있다.
//			System.out.println(sc.nextLine());
//		}
//		
//		catch (Exception e ) {
//			System.out.println("456");
//			System.out.println();
//			e.getMessage();
//			System.out.println();
//			e.printStackTrace();
//			
//		}
//	}
//	public static void main(String[] args) {
//		TryWithResources2 twr = new TryWithResources2();
//		twr.getData("test.txt");
//	}
//}
