package java04;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation)
	{
		super(location,maxRotation);
	}
	//�żҵ�
	@Override
	public boolean roll() {
		++accumilateRotation;
		if(accumilateRotation < maxRotation)
		{
			System.out.println(location + "KumhoTire ����:"+(maxRotation-accumilateRotation)+"ȸ");
			return true;
		}
		else
		{
			System.out.println("***"+location+"KumhoTire ��ũ ***");
			return false;
		}
	}
}
