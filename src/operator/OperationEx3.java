package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // num=20이고 10보다 큼(거짓), 논리 곱에서 앞 항이 거짓이므로 뒷 항은 실행 안함
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // num1=30 10보다 큼(참), 논리 합에서 앞 항이 참이므로 뒷 항은 실행 안함
		System.out.println(value); // true
		System.out.println(num1); // 30
		System.out.println(i); // 2
	}

}
 