package classpart;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // add 함수 호출
		System.out.println(num1+"+"+num2+"="+sum+"입니다.");
		
		int sub = minus(num1, num2); // add 함수 호출
		System.out.println(num1+"-"+num2+"="+sub+"입니다.");
		
		int mul = multiply(num1, num2); // add 함수 호출
		System.out.println(num1+"*"+num2+"="+mul+"입니다.");
		
		int div = divide(num1, num2); // add 함수 호출
		System.out.println(num1+"/"+num2+"="+div+"입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1+n2;
		return result; // 결과 값 반환
	}
	public static int minus(int n1, int n2) {
		int result = n1-n2;
		return result; // 결과 값 반환
	}
	public static int multiply(int n1, int n2) {
		int result = n1*n2;
		return result; // 결과 값 반환
	}
	public static int divide(int n1, int n2) {
		int result = n1/n2;
		return result; // 결과 값 반환
	}
}
