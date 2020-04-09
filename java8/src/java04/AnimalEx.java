package java04;

public class AnimalEx {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.speak();
		a1.eat();
		
		a1 = new Dog();
		a1.speak();      //입력값에따라 출력이달라짐 다형성
		a1.eat();
		
		a1 =new Cat();
		a1.speak();
		a1.eat();
		System.out.println();
		Animal a2 = new Animal();
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		a2.hawl(cat);
		a2.hawl(dog);
	}

}
