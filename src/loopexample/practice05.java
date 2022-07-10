package loopexample;

public class practice05 {

	public static void main(String[] args) {
		for(int i=0;i<=7;i++) {
			if(i%2==0) continue;
			else {
				for(int j=3;j-(i/2)>0; j--) {
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}	
}