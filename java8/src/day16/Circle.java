package day16;

public class Circle {
	
	static final double PI = 3.14; // �������
	
	int r;
	
	
	double area(int r) {
		return PI * r * r ;
	}
	
	String showCicle(){
		return "Radius:"+r;
	}
}
