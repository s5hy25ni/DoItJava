package string;

public class StringTest1 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);    //false -> 인스턴스 새로 생성
		System.out.println(str1.equals(str2)); //true
	
		String str3 = "abc";
		String str4 = "abc";
	
		System.out.println(str3 == str4);  //true -> 상수 풀에 저장
		System.out.println(str3.equals(str4)); //true
	}
}