package day15;

public class IndexOfEx {
	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		int index = str.indexOf("����");
		System.out.println(index);
		index = str.indexOf("C���");
		System.out.println(index);
		str = "�ڹ��ڹ��ڹ� �������� �׷��������Դϴ�.";
		index = str.indexOf("��");
		System.out.println(index);
		index = str.indexOf("��", index + 1); // ù��° �Ű������� �˻���, �ι�° �˻���� �˻� ������ġ �ε���
		System.out.println(index);
		index = str.indexOf("��", index + 1);
		System.out.println(index);
		index = str.indexOf("��", index + 1);
		System.out.println(index);
		
	}
}
