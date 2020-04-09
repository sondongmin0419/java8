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
		System.out.println(this.company+"에서 만든 "+this.year+"년형 "+this.size+"인치 TV");
	}
}
