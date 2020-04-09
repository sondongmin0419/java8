package java04;

public class person {
	void sound () {
		System.out.println("말하다");
	}
	void run() {
		System.out.println("달리다");
	}
	void eat() {
		System.out.println("음식을 먹다.");
	}
	void oneDay() {
//		person person = new person();가능하지만 같은 클래스에서는 굳이 안만들어도됨
		this.sound();
		run();
		eat();
	}
}
