package day15;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl.changeBattery();
		TV tv = new TV();
		Audio audio = new Audio();
//		RemoteControl rc = new RemotoControl();
		RemoteControl rc;
		rc = tv;
		rc = new TV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		
		rc = audio;
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("보일러를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("보일러를 끕니다");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("온도의 단계를 : "+volume +"단계로 변경합니다.");
			}
		};
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		rc = new IpTV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc =new IpTV2();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
	}

}
