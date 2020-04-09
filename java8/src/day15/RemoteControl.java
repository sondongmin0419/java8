package day15;

public interface RemoteControl {
//	public static int MAX_VOLUME = 10;  클래스에서는 pubilc satatic을 붙여야 상수지만
	int MAX_VOLUME = 10; // 인터페이스에서는 자동으로 상수취급
	int MIN_VOLUME = 0;
	
	abstract void turnOn(); //추상매소드는 abstrct를 붙여아하나 인터페이스에서는 붙이지않아도 자동으로 인식
	void turnOff();
	void setVolume(int volume);
	
//	void method() {  이런식으로 일반매소드 불가
//		
//	}
//	아래처럼해야 가능
	default void setMute(boolean mute) {
		if(mute) System.out.println("음소거 상태로 설정합니다.");
		else System.out.println("음소거 상태를 해제합니다.");
	}
	
	//정적 메소드
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
