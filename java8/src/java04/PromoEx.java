package java04;

public class PromoEx {

	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();
		
		PromoParent pp = pc;  //�ڽ��� �θ� ���԰���.. �ڵ� ����ȯ
		pp.method1();
		pp.method2();
//		pp.mmthod3(); �θ��� �����̱⶧���� �ȵ�
//		pc = pp; �ڽĿ� �θ� ������ �� ����.
		
		pc = (PromoChild)pp; //�ڽĿ� �θ� ������ �������� ���� ����ȯ�� ����
		pc.method1(); //�θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ���� �������� �ڽ� ��ü����߸� �Ѵ�.
		pc.method2();
		pc.method3();
		
		PromoParent pp2 = new PromoParent();
		if(pp2 instanceof PromoChild) { //instanceof�� ����ȯ�� �������� boolean������ ��ȯ�ϴ°�.
			pc = (PromoChild)pp2; //��������ȯ�� ������ ���·θ� ��������
			pc.method3();			
		}
		else {
			System.out.println("��������ȯ�� ����� �� �����ϴ�.");
		}
	}

}
