package day15;

public interface RemoteControl {
//	public static int MAX_VOLUME = 10;  Ŭ���������� pubilc satatic�� �ٿ��� �������
	int MAX_VOLUME = 10; // �������̽������� �ڵ����� ������
	int MIN_VOLUME = 0;
	
	abstract void turnOn(); //�߻�żҵ�� abstrct�� �ٿ����ϳ� �������̽������� �������ʾƵ� �ڵ����� �ν�
	void turnOff();
	void setVolume(int volume);
	
//	void method() {  �̷������� �Ϲݸżҵ� �Ұ�
//		
//	}
//	�Ʒ�ó���ؾ� ����
	default void setMute(boolean mute) {
		if(mute) System.out.println("���Ұ� ���·� �����մϴ�.");
		else System.out.println("���Ұ� ���¸� �����մϴ�.");
	}
	
	//���� �޼ҵ�
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
