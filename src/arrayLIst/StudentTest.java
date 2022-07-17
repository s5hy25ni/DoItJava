package arrayLIst;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("±¹¾î", 100);
		studentLee.addSubject("¼öÇÐ", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("±¹¾î", 70);
		studentKim.addSubject("¼öÇÐ", 85);
		studentKim.addSubject("¿µ¾î", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}
}