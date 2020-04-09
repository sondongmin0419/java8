package day16;

import java.util.Arrays;

import javax.swing.text.WrappedPlainView;

public class WildCardEx {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName()+" 수강생 : " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName()+" 수강생 : " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+" 수강생 : " + Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		
		Person person = new Person("일반인");
		Worker worker = new Worker("직장인");
		Student student = new Student("학생");
		HighStudent highStudent = new HighStudent("고등학생");
		Course<Person> personCourse = new Course<>("일반인코스", 5);
	
		personCourse.add(person);
		personCourse.add(worker);
		personCourse.add(student);
		personCourse.add(highStudent);
		
		registerCourse(personCourse);
//		registerCourseStudent(personCourse);
		registerCourseWorker(personCourse);
		System.out.println();
		
		Course<Student> studentCourse = new Course<Student>("학생코스", 5);
//		studentCourse.add(person);
//		studentCourse.add(woker);
		studentCourse.add(student);
		studentCourse.add(highStudent);
		
		registerCourse(studentCourse);
		registerCourseStudent(studentCourse);
//		registerCourseWorker(studentCourse);
		System.out.println();
		
		Course<Worker> worKerCourse = new Course<Worker>("직장인코스", 5);
//		worKerCourse.add(person);
		worKerCourse.add(worker);
//		worKerCourse.add(Student);
//		worKerCourse.add(highStudent);
		
		registerCourse(worKerCourse);
//		registerCourseStudent(worKerCourse);
		registerCourseWorker(worKerCourse);
		
	}
	
}
