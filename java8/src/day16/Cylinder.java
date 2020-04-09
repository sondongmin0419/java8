package day16;

public class Cylinder extends Circle {
	int height;
	
	Cylinder(int r ,int h){
		this.r=r;
		this.height=h;
	}
	
	double volume() {
		double area = area(r);
		return area*height;
		}
	
	String showCylinder() {
		return showCicle() + ",height: " + height;
	}

}
