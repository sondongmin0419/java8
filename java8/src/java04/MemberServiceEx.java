package java04;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Member hong = new Member("ȫ�浿","hong");
		
		
		hong.password = "12345";
		hong.age = 30;
		if(ms.login(hong.id, hong.password))
		{
			System.out.println("�α����Ͽ����ϴ�.");
			ms.logout(hong.id);
		}
		else
		{
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
		}
		
		Member lee = new Member("�̿���","lee");
		lee.password = "12345";
		lee.age=20;
		
		if(ms.login(lee.id, lee.password))
		{
			System.out.println("�α����Ͽ����ϴ�.");
			ms.logout(lee.id);
		}
		else
		{
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
		}
		
	}

}
