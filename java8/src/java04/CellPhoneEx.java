package java04;

public class CellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone	dcp = new DmbCellPhone("������S20", "����", 10);
		dcp.powerOn();								//�θ���
		dcp.bell();
		dcp.sendVoice("��������:");			
		dcp.receiveVoice("�ù��Դϴ�.");
		dcp.sendVoice("���տ� �����ּ���.");
		dcp.receiveVoice("�˰ڽ��ϴ�.");
		dcp.hangUp();
		dcp.turnOnDmb();
		dcp.turnOffDmb();
		dcp.powerOff();
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOnDmb(); �θ��� ��ü�� �ڽĤ��� �ν��Ͻ� ����� ȣ���� �� ����.
		cp.powerOff();
	}

}
