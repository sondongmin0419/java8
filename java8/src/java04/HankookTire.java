package java04;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation)
		{
			super(location,maxRotation);
		}
		//�żҵ�
		@Override
		public boolean roll() {
			++accumilateRotation;
			if(accumilateRotation < maxRotation)
			{
				System.out.println(location + "HankookTire ����:"+(maxRotation-accumilateRotation)+"ȸ");
				return true;
			}
			else
			{
				System.out.println("***"+location+"HankookTire ��ũ ***");
				return false;
			}
		}
}
