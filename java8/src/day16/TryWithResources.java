//package day16;
//
//import java.io.File;
//import java.util.Scanner;
//
//
//public class TryWithResources {
//	public void getData(String file)
//	{
//		Scanner sc = null;
//		try {
//			sc = new Scanner(new File(file));
//			System.out.println(sc.nextLine());
//			
//		}catch (Exception e ) {
//			System.out.println("123");
//			System.out.println();
//			e.getMessage();
//			System.out.println();
//			e.printStackTrace();
//			
//		}finally { //����� ��Ʈ���� ������ �ݱ� ���ؼ� finally ������ �̿� / 1.6���� ����
//			if (sc !=null)
//			{
//				sc.close();
//			}
//		}
//	}
//	public static void main(String[] args) {
//		TryWithResources twr = new TryWithResources();
//		twr.getData("test.txt");
//		
//	}
//}
