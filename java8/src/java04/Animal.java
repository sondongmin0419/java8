package java04;

public class Animal {
	void speak() {
		System.out.println("울음소리를 내다.");
	}
	void eat() {
		System.out.println("먹이를 먹는다.");
	}
	void hawl(Animal animal) {
		animal.speak();
	}
}
