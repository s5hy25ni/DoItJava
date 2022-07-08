package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		// 자료형이 다른 정수끼리 더하면?
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal+bVal); // 정수 값 연산시 4바이트가 기본 단위, 더하기 전 모두 int형으로 변환 후 int형으로 저장됨.
	}
}
