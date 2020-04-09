package java8;

public class day1006 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[][] ary = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } }; // new int[4][2];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int[][] ary2 = { { 10, 20, 30 }, { 40 }, { 50, 60 } };
		for (int i = 0; i < ary2.length; i++) {
			for (int j = 0; j < ary2[i].length; j++) {
				System.out.print(ary2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
