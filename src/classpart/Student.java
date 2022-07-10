package classpart;

public class Student {
	
	// 멤버변수(member variable), 속성(property), 특성(attribute)
	int studentID; // 학번
	String studentName; // 이름
	int grade; // 학년
	String address; // 사는 곳
	
	// 멤버 함수(member function), 메서드(method)
	public void showStudentInfo(){
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() { // 학생 이름 반환
		return studentName;
	}
	
	public void setStudentName(String name) { // 학생 이름을 매개변수로 전달
		studentName = name;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
