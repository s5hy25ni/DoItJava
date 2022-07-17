package array;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1001, "James"));
		studentList.add(new Student(1002, "Tomas"));
		studentList.add(new Student(1003, "Edward"));
		
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			student.showStudentInfo();
		}
		

	}

}
