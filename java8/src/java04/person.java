package java04;

public class person {
	void sound () {
		System.out.println("���ϴ�");
	}
	void run() {
		System.out.println("�޸���");
	}
	void eat() {
		System.out.println("������ �Դ�.");
	}
	void oneDay() {
//		person person = new person();���������� ���� Ŭ���������� ���� �ȸ�����
		this.sound();
		run();
		eat();
	}
}
