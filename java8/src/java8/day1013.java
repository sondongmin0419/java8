package java8;

import java.util.Scanner;

public class day1013 {

	public static void main(String[] args) {
//		String[][] menu = new String[4][2];
//		menu[0][0] = "±è¹ä 1ÁÙ";
//		menu[0][1] = "2000";
//		menu[1][0] = "¶±ººÀÌ 1ÀÎºÐ";
//		menu[2][0] = "¿Àµ­ 1°³";
//		menu[3][0] = "¼ø´ë 1ÀÎºÐ";
//		System.out.println(menu[0][1];
		Scanner sc = new Scanner(System.in);
		
		int kim = 2000;
		int dduck = 2000;
		int oh = 500;
		int soon = 2000;
		int knum,dnum,onum,snum;

		System.out.println("¸ÔÀº ±è¹ä , ¶±ººÀÌ, ¿Àµ­, ¼ø´ëÀÇ ¼ö¸¦ ¼ø¼­´ë·Î ÀÔ·ÂÇÏ½Ã¿À.");
		System.out.println("°¡°Ý : ±è¹ä:2000¿ø, ¶±ººÀÌ:2000¿ø, ¿Àµ­:500¿ø, ¼ø´ë:2000¿ø");
		knum = sc.nextInt();
		dnum = sc.nextInt();
		onum = sc.nextInt();
		snum = sc.nextInt();
		System.out.println("ÃÑÇÕÀº:" + (kim*knum+dduck*dnum+oh*onum+soon*snum)+"¿ø ÀÔ´Ï´Ù.");
	}

}
