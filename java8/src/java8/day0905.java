package java8;

public class day0905 {

	public static void main(String[] args) {
		for (int i=0;i<26;i++)
		{
			System.out.printf("%c, ",i+65);
		}
		System.out.println("");
		
		for (int i=0;i<26;i++)
		{
			System.out.printf("%c, ",i+97);
		}
		System.out.println("");
		
		for (int i='a';i<='z';i++)
		{
			System.out.printf("%c, ",i);
		}
	}

}
//System.out.printf() �� ���� (format)�� �°� ����ϴ� �޼ҵ��Դϴ�.
//printf�� c���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����� �� �ֽ��ϴ�.
//ù��° �μ�(�Է°�)�� ��� ������ �Է��ϰ�
//�ι�°���ʹ� ������Ŀ� ������ ������ �Է��մϴ�.

//������ ������ %�� �����մϴ�.
//d:decimal ������
//f:float �Ǽ�
//lf: long float -> double
//o : octa 8����
//x : hexa 16����
//b:binary 2����
//s:string ���ڿ�
//c:char ���� 1��

//������ �� �ִ� ��
/*���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ����
* %2d ->�������� 2�ڸ� ��� 
* ���ھտ� 0�����̸� ������� 0���� ä���.
*/