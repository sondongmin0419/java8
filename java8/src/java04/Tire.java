package java04;

public class Tire {
	//�ʵ�
	public int maxRotation;    //�ִ� ȸ����
	public int accumilateRotation; //���� ȸ����
	public String location; //Ÿ�̾� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//�żҵ�
	public boolean roll() {
		++accumilateRotation;
		if(accumilateRotation < maxRotation)
		{
			System.out.println(location + "Tire ����:"+(maxRotation-accumilateRotation)+"ȸ");
			return true;
		}
		else
		{
			System.out.println("***"+location+"Tire ��ũ ***");
			return false;
		}
	}
}
