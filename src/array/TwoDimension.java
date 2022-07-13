package array;

public class TwoDimension {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}}; // 이차원 배열 선언과 함께 초기화
	
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			
			System.out.println();
		}
		
		char[][] alpha = new char[13][2];
		char init = 'A';
		
		for(int i=0; i<alpha.length; i++) {
			for(int j=0; j<alpha[i].length; j++) {
				alpha[i][j] = init;
				System.out.println(alpha[i][j]+ "");
				init++;
			}
			System.out.println();
		}
	}
}
