package java04;

public class CellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone	dcp = new DmbCellPhone("갤럭시S20", "레드", 10);
		dcp.powerOn();								//부모의
		dcp.bell();
		dcp.sendVoice("여보세요:");			
		dcp.receiveVoice("택배입니다.");
		dcp.sendVoice("집앞에 놓아주세요.");
		dcp.receiveVoice("알겠습니다.");
		dcp.hangUp();
		dcp.turnOnDmb();
		dcp.turnOffDmb();
		dcp.powerOff();
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOnDmb(); 부모의 객체는 자식ㅇ의 인스턴스 멤버를 호출할 수 없다.
		cp.powerOff();
	}

}
