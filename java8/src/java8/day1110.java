package java8;

import java.util.Scanner;

public class day1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 상품의 단가와 수량을 입력하시오.");
		int price = sc.nextInt();
		int num = sc.nextInt();
		int sum = price * num;
		int sum2=sum;
		int sale=0;
		if (sum >=1000000)
		{
			sum2=(int)(sum*0.6);
			sale=40;
		}
		else if (sum>500000)
		{
			sum2=(int)(sum*0.7);
			sale=30;
		}
		System.out.println("상품가격 : "+price/10000+"만원, 상품 수량 ; "+num+"개");
		System.out.println("총 상품구입가격이 "+sum/10000+"만원이라 "+sale+"%할인하여 "+sum2/10000+"만원 입니다.");
		
	}

}
