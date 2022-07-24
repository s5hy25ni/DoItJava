package string;

public class StringTest2 {

	public static void main(String[] args) {

		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println(androidStr);
		System.out.println("java 문자열 주소 값: "+ System.identityHashCode(javaStr));
		System.out.println("android 문자열 주소 값: "+ System.identityHashCode(androidStr));
		
		javaStr = javaStr.concat(androidStr); //java 와 android 문자열의 연결
		
		System.out.println(javaStr);
		System.out.println("java android 문자열 주소 값: " +System.identityHashCode(javaStr));
	}
}