package java04;

public class Tv {
	String company;
	int year;
	int size;
	
	Tv(String company,int year,int size){
		this.company = company;
		this.year = year;
		this.size = size;
	}
	void show() {
		System.out.println(this.company+"���� ���� "+this.year+"���� "+this.size+"��ġ TV");
	}
}
