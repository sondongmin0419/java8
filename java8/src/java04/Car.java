package java04;

public class Car {
	//필드
	String company="기아자동차";
	String model="쏘울";
	String color="파랑";
	int maxSpeed=250;
	int speed=20;

	//생성자 - 입력안할시 기본생성자가 자동으로 추가됨
	Car(){
//		this.company = "기아자동차";
//		this.color = "검정";
//		this.maxSpeed = 300;
		this("기아자동차","검정",300);
	}
		
	Car(String com, String col, int max){
		this.company = com; //이런경우 this없어도 됨. 하지만 보통의 경우 이름과 변수이름 같게하여 this사용하는 거추천
		this.color = col;
		this.maxSpeed = max;
		
	}
//	Car (String color,int maxSpeed){	
//		this.Car("기아자동차",color,maxSpeed);

//	}
	Car (int maxSpeed){
		this.company = "기아자동차";
		this.color = "검정";
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
////	Car(String color,String company,int maxSpeed){ 매개변수의 이름이달라도 자료형의 형태가 동일하면 사용 불가능
//		
//	}
	
	// 메소드
	void accel() {
		speed +=10;
		if (speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("현재속도: "+speed);

	}
	
	void brake() {
		speed = 0;
		System.out.println("현재속도: "+speed);
	}
	
}

