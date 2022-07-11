package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName="안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1); // 참조 변수 값 = 힙 메모리에 생성된 인스턴스의 메모리 주소
		System.out.println(student2);

	}

}
