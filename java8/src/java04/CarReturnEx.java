package java04;

public class CarReturnEx {

	public static void main(String[] args) {
		CarReturn myCar = new CarReturn();
		myCar.setGas(5);
		if(myCar.isLeftGas()) {
			myCar.run();
		}
		else {
			System.out.println("가스를 충전하세요.");
		}
	}

}
