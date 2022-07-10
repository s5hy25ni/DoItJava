package loopexample;

public class practice05A {

	public static void main(String[] args) {
		int line = 4;
		int space = (line/2)+1;
		int star = 1;
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<star; k++) {
				System.out.print("*");
			}
			System.out.println();
			space -= 1;
			star += 2;
		}

	}

}
