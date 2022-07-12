package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) { // 버스 번호를 매개변수로 받는 생성자
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money; // 버스 수입 증가
		passengerCount++; // 승객 수 증가
	}
	
	public void showInfo() {
		System.out.println("지하철 "+lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
}
