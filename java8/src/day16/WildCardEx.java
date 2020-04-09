package day16;

import java.util.Arrays;

import javax.swing.text.WrappedPlainView;

public class WildCardEx {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+" ������ : " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+" ������ : " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+" ������ : " + Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		
		Person person = new Person("�Ϲ���");
		Worker worker = new Worker("������");
		Student student = new Student("�л�");
		HighStudent highStudent = new HighStudent("����л�");
		Course<Person> personCourse = new Course<>("�Ϲ����ڽ�", 5);
	
		personCourse.add(person);
		personCourse.add(worker);
		personCourse.add(student);
		personCourse.add(highStudent);
		
		registerCourse(personCourse);
//		registerCourseStudent(personCourse);
		registerCourseWorker(personCourse);
		System.out.println();
		
		Course<Student> studentCourse = new Course<Student>("�л��ڽ�", 5);
//		studentCourse.add(person);
//		studentCourse.add(woker);
		studentCourse.add(student);
		studentCourse.add(highStudent);
		
		registerCourse(studentCourse);
		registerCourseStudent(studentCourse);
//		registerCourseWorker(studentCourse);
		System.out.println();
		
		Course<Worker> worKerCourse = new Course<Worker>("�������ڽ�", 5);
//		worKerCourse.add(person);
		worKerCourse.add(worker);
//		worKerCourse.add(Student);
//		worKerCourse.add(highStudent);
		
		registerCourse(worKerCourse);
//		registerCourseStudent(worKerCourse);
		registerCourseWorker(worKerCourse);
		
	}
	
}
