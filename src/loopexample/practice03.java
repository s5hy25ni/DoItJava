package loopexample;

public class practice03 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			if(i%2==0) {
				for(int j=1; j<=9; j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
			} else {
				continue;
			}
			System.out.println();
		}

	}

}
