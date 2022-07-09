package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		int lastScore1 = ++gameScore; // 증가 후 대입
		System.out.println(lastScore1); // 151
		
		int lastScore2 = --gameScore; // 감소 후 대입
		System.out.println(lastScore2); // 150
		
		lastScore1 = gameScore++; // 대입 후 증가 lastScore1=150, gameScore=151
		System.out.println(lastScore1);
		lastScore2 = gameScore--; // 대입 후 감소 lastScore2=151, gameScore=150
		System.out.println(lastScore2);
		System.out.println(gameScore);

	}

}
