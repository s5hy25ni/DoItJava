package operator;

public class practice01 {

	public static void main(String[] args) {
		int num = 5;
		int i = 10;
		
		boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		// num=50이므로 참, 논리 합이므로 뒷항 실행 안함
		
		System.out.println(value); // ture
		System.out.println(num); // 50
		System.out.println(i); // 10
		

	}

}
