package java04;

public class Car {
	//�ʵ�
	String company="����ڵ���";
	String model="���";
	String color="�Ķ�";
	int maxSpeed=250;
	int speed=20;

	//������ - �Է¾��ҽ� �⺻�����ڰ� �ڵ����� �߰���
	Car(){
//		this.company = "����ڵ���";
//		this.color = "����";
//		this.maxSpeed = 300;
		this("����ڵ���","����",300);
	}
		
	Car(String com, String col, int max){
		this.company = com; //�̷���� this��� ��. ������ ������ ��� �̸��� �����̸� �����Ͽ� this����ϴ� ����õ
		this.color = col;
		this.maxSpeed = max;
		
	}
//	Car (String color,int maxSpeed){	
//		this.Car("����ڵ���",color,maxSpeed);

//	}
	Car (int maxSpeed){
		this.company = "����ڵ���";
		this.color = "����";
		this.maxSpeed = maxSpeed;
		
	}
//	
//	Car(String company, int maxSpeed, String color){
//		
//	}
//	
//	Car(String color,int speed,int maxSpeed){
//		
//	}
//	
//	Car(String company,String coler,int maxSpeed, int speed){
//		
//	}
//	
////	Car(String color,String company,int maxSpeed){ �Ű������� �̸��̴޶� �ڷ����� ���°� �����ϸ� ��� �Ұ���
//		
//	}
	
	// �޼ҵ�
	void accel() {
		speed +=10;
		if (speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("����ӵ�: "+speed);

	}
	
	void brake() {
		speed = 0;
		System.out.println("����ӵ�: "+speed);
	}
	
}

