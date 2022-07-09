package operator;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore; // totalScore = 160
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0; // avgScore = 80.0
		System.out.println(avgScore);
		
		int korScore = 100;
		totalScore += korScore;
		System.out.println(totalScore);
		avgScore = totalScore / 3.0;
		System.out.println(avgScore);

	}

}