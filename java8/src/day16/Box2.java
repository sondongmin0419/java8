package day16;

public class Box2<T> {//제네릭은 타입매개변수
	private T object;
	void set(T object) {
		this.object = object;
	}
	T get() {
		return object;
	}
	
}
