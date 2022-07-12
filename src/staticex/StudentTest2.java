package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // 클래스로 직접 참조하라고 노란색 줄 나옴
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName+" 학번: "+studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName+" 학번: "+studentSon.studentID);


	}

}
