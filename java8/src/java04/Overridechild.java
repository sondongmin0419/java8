package java04;

public class Overridechild extends OverrideParent{
	void method3() {
		System.out.println("자식 매서드3");
	}
	
	@Override
	void method2() {
		System.out.println("자식메서드2");
	}
}
