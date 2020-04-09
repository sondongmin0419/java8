package java04;

public class CarReturn {
	int gas;
	
	void setGas(int gas){
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas ==0)
		{
			System.out.println("가스가 없습니다.");
			return false;
		}
		else
			System.out.println("가스가 있습니다.");
		return true;
	}
	void run () {
		while(true) {
			if (gas>0)
			{
				System.out.println("달립니다. (gas잔량 : "+gas+")");
				gas -=1;
			}
			else
			{
				System.out.println("멈춥니다. (gas 잔량 : "+gas+")");
				System.out.println("임시출력");
				return;
//				System.out.println("리턴 후 출력");
			}
		}
	}
	
}
