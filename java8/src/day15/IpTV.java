package day15;

public class IpTV implements RemoteControl,Internet{
	private int volume;
	@Override
	public void searchWeb() {
		System.out.println("인터넷을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(this.volume +"으로 볼륨을 변경합니다.");
		
	}
	
}
