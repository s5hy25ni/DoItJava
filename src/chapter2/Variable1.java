package chapter2;

public class Variable1 {
	public static void main(String[] args) {
			int level; // 정수형 변수 level을 선언
			level = 10; // level 변수에 값 10 대입, 변수에 처음 값 대입 = 초기화
			System.out.println(level); // level 값 출력
			
			int age = 27; // 변수 선언과 동시에 값 대입 가능
			System.out.println(age);
			
			// 자료형이 다른 정수끼리 더하면?
			short sVal = 10;
			byte bVal = 20;
			System.out.println(sVal+bVal); // 정수 값 연산시 4바이트가 기본 단위, 더하기 전 모두 int형으로 변환 후 int형으로 저장됨.
			
			char ch1 = 'A';
			System.out.println(ch1); // 문자 출력
			System.out.println((int)ch1); // 문자에 해당하는 정수 값(아스키 코드 값) 출력
			ch1 = 'Z';
			System.out.println(ch1);
			System.out.println((int)ch1);
			
			char ch2 = 66; // 정수 값 대입
			System.out.println(ch2); // 정수 값에 해당하는 문자 출력
			ch2 = 38;
			System.out.println(ch2);
			
			int ch3 = 67;
			System.out.println(ch3); // 정수 값 출력
			System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력
			ch3 = 97;
			System.out.println(ch3);
			System.out.println((char)ch3);
			
			char ch4 = '한';
			char ch5 = '\uD55C';
			System.out.println(ch4);
			System.out.println(ch5);
			
	}
}