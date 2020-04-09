package day16;

public class BoxEx {

	public static void main(String[] args) {
		String name = "홍길동 ";
		Box box = new Box();
		box.set(name);  //String -> Object로 자동 형변환 된것.
		String name2 = (String)box.get();//object에서 STring으로 강제형번환 
		System.out.println(name2);
		
		Apple apple = new Apple();
		System.out.println(apple.hashCode());
		box.set(apple);
		Apple apple2 = (Apple)box.get();
		System.out.println(apple2.hashCode());
		
		Box2<String> box2 = new Box2<String>();
		box2.set(name);
		name2 = box2.get();
		System.out.println(name2);
		
//		box2.set(apple); //box2 는 제네릭으로 String만 사용하도록 설정해뒀기때문
		Box2<Apple> box3 = new Box2<Apple>();
		box3.set(apple);
		apple2 = box3.get();
//		box3.set(name); box3는 Aplle만 사용가능 String 사용불가
	}

}
