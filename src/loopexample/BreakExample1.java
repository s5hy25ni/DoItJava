package loopexample;

public class BreakExample1 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		// 0부터 1씩 증가하면서 합을 계산할 때 숫자를 몇까지 더하면 100이 넘는지?
		for(num=0; ; num++) {
			// 조건식을 생략하는 대신 break문 사용, sum < 100 을 하면 num이 100 보다 큰 값을 만드는 수가 아닌 그 다음 수가 됨.
			sum += num;
			if(sum>=100) break; // num이 증가하지 않고 빠져나옴.
		}
		System.out.println("num : "+num);
		System.out.println("sum : "+sum); 
	}

}
