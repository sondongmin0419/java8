package day16;

import java04.Student;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	
	public void add(T t) { //배열의 ㅂ ㅣ어있는 부분을 찾아서 수강생을 추가하는 매소드
		for (int i=0;i<students.length;i++)
		{
			if(students[i] ==null) {
				students[i]=t;
				break;
			}
		}
		
	}
}
