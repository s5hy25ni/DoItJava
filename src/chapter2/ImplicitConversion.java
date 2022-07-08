package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; // byte형 값이 int형 변수로 대입됨(바이트 크기가 더 큰 자료형으로 변환)
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // int형 값이 float형 변수로 대입됨(더 정밀한 자료형으로 변환)
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; // int형이 float형으로 변환 후 float형으로 변환
		System.out.println(dNum);

	}

}
