package day16;

public class Util {
	public static <T> Box2<T> boxing(T t){
		Box2<T> box = new Box2<T>();
		box.set(t);
		return box;
	}
	
	public static <T extends Number> int compare(T t1, T t2) { //extends 는 최상위 클래스를 설정할때 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
		
	}
	
	public static Box2<String> boxing(String string) {
		return null;
	}
}
