package day16;

public class UtilEx {

	public static void main(String[] args) {
		Box2<String> box = Util.<String>boxing("홍길동");
		String name = box.get();
		System.out.println(name);
//		                                                                                                                                                                             소드호출시 제네릭이 유추된다면 생략할 수 있다
//		int number = box2.get();
//		System.out.println(number);
	}
	

}
