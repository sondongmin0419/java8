package java04;

public class CompareToEx {

	public static void main(String[] args) {
		String a ="Java Programming Very Good";
		String b ="Java Programming";
		
		int res = a.compareTo(b);
		System.out.println("비교결과 : "+res);
		
		
		boolean compare1 = a.regionMatches(false, 5, b, 5, 11);
		boolean compare2 = a.regionMatches(true, 0, b, 0, 4);
		boolean compare3 = a.regionMatches(false, 0, b, 0, 4);
		
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);



		
	
	}

}
