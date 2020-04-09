package java04;

public class Child extends Parent{
	Child(String name){
		super(name);// 적지않아도 자동생성 부모를 호출하게함
		System.out.println("자식을 생성합니다.");
	}
}
