package java04;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car("�ֿ��ڵ���","���",350); //car ��ü ����

		System.out.println(myCar.company);
		System.out.println(myCar.model);
		
		myCar.company = "�����ڵ���";
		myCar.model = "�ƹ݋�";
		myCar.color  = "����";
		myCar.maxSpeed = 300;
		myCar.speed = 100;
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
	
		Car yourCar = new Car(null, null, 0);

		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		
		System.out.println("������ ����");
		

		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.speed);
		                    
		Car c2 = new Car(250);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		System.out.println(c2.speed);
		

		Car c3 = new Car(350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		System.out.println(c3.speed);
		
		c3.accel();
		c3.maxSpeed = 325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		
	}

}
