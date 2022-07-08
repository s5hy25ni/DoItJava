package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
			double dNum1 = 1.2;
			float fNum2 = 0.9F;
			
			int iNum3 = (int)dNum1 + (int)fNum2;
			int iNum4 = (int)(dNum1 + fNum2);
			
			// 같은 연산이라도 형 변환이 언제 이루어졌는지에 따라 결과 값이 다를 수 있음.
			System.out.println(iNum3);
			System.out.println(iNum4);

	}

}
