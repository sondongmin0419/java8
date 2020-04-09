package java04;

public class Student { //
	private String name;
	private String gender;
	private int age;
	private int snum;
	public String setName;
	
	
	public Student(String name, String gender, int age, int snum) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.snum = snum;
	}
	
	public Student() {}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public void setsnum(int snum){
		{
			if (gender.equals("����"))
			{
				snum+=2000;
			}
			else
			{
				snum+=1000;
			}
			this.snum = snum;
		}
	}
	
	public void showInfo() {
		System.out.print("���� : ");
		System.out.println(name);
		System.out.print("���� : ");
		System.out.println(gender);
		System.out.println("���� : "+age);
		System.out.println("��ȣ : "+snum);
	}
}
