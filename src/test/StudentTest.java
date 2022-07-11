package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address ="양천구";
		// studentLee.studentName = "이상원"; -> 오류 발생, private 변수
		
		studentLee.setStudentName("이상원");
		System.out.println(studentLee.getStudentName());

	}

}
