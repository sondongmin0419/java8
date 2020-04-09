package day15;

public class IndexOfEx {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		int index = str.indexOf("프로");
		System.out.println(index);
		index = str.indexOf("C언어");
		System.out.println(index);
		str = "자바자바자바 프로프로 그래밍이이입니다.";
		index = str.indexOf("바");
		System.out.println(index);
		index = str.indexOf("바", index + 1); // 첫번째 매개변수는 검색어, 두번째 검색어는 검색 시작위치 인덱스
		System.out.println(index);
		index = str.indexOf("바", index + 1);
		System.out.println(index);
		index = str.indexOf("바", index + 1);
		System.out.println(index);
		
	}
}
