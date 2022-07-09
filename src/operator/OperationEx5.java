package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101; // 0B는 2진수를 나타냄, 10진수 5를 2진수로 나타낸 숫자
		
		System.out.println(num << 2); // 왼쪽으로 2만큼 0으로 밀어냄, 0B00010100 = 20
		System.out.println(num >> 2); // 오른쪽으로 2만큼 부호 비트와 동일한 값(0)으로 밀어냄, 0B00000001 = 1
		System.out.println(num >>> 2); // 오른쪾으로 2만큼 0으로 밀어냄, 0B00000001 = 1
		
		System.out.println(num); // 5
		
		num = num << 2;
		System.out.println(num); // 20

	}

}
