package java04;

public class CellPhone {
	String model;
	String color;
	String message;
	
	void powerOn() {
		System.out.println("�ý����� �մϴ�");
	}
	void powerOff() {
		System.out.println("�ý����� ���ϴ�");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendVoice(String message) {
		System.out.println("�ڱ� :"+message);
	}
	void receiveVoice(String message) {
		System.out.println("����: "+message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
