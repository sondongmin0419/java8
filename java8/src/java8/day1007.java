package java8;

public class day1007 {

	public static void main(String[] args) {
		int[][] ary1 = new int[][] {{10,20},{30,40},{50,60}};
		System.out.println(ary1.length);
		System.out.println(ary1[0].length);
		
		int[][] ary2 = new int[3][2];
		System.out.println(ary1.length);
		System.out.println(ary1[0].length);
		
		//길이가 다른 2차원 배열
		
		int[][] ary3=new int[3][];
		ary3[0]=new int[5];
		ary3[1]=new int[3];
		ary3[2]=new int [10];
		System.out.println(ary3.length);
		System.out.println(ary3[0].length);
		System.out.println(ary3[1].length);
		System.out.println(ary3[2].length);

	}
}
