package day16;

public class UtilEx {

	public static void main(String[] args) {
		Box2<String> box = Util.<String>boxing("ȫ�浿");
		String name = box.get();
		System.out.println(name);
//		                                                                                                                                                                             �ҵ�ȣ��� ���׸��� ���ߵȴٸ� ������ �� �ִ�
//		int number = box2.get();
//		System.out.println(number);
	}
	

}
