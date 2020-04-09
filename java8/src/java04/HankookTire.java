package java04;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation)
		{
			super(location,maxRotation);
		}
		//매소드
		@Override
		public boolean roll() {
			++accumilateRotation;
			if(accumilateRotation < maxRotation)
			{
				System.out.println(location + "HankookTire 수명:"+(maxRotation-accumilateRotation)+"회");
				return true;
			}
			else
			{
				System.out.println("***"+location+"HankookTire 펑크 ***");
				return false;
			}
		}
}
