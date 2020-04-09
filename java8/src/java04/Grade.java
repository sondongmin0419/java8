package java04;

public class Grade {
	int kor;
	int eng;
	int mat;
	
	Grade(int kor,int eng,int mat){
		this.kor = kor;
		this.eng =eng;
		this.mat =mat;
	}
	
	double avg() {
		double avg = (kor+eng+mat)/3;
		
		return avg;
	}
}
