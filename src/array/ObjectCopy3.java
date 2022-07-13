package array;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		Book[] bookArray3 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

		for(int i=0; i<bookArray2.length; i++) { // 얕은 복사(shallow copy)
			bookArray2[i] = new Book();
			bookArray2[i] = bookArray1[i];
			System.out.println(bookArray1[i].getAuthor()+", "+bookArray1[i].getBookName());
			System.out.println(bookArray2[i].getAuthor()+", "+bookArray2[i].getBookName());
		}
		
		for(int i=0; i<bookArray3.length; i++) { // 깊은 복사(deep copy)
			bookArray3[i] = new Book();
			bookArray3[i].setBookName(bookArray1[i].getBookName());
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			System.out.println(bookArray1[i].getAuthor()+", "+bookArray1[i].getBookName());
			System.out.println(bookArray3[i].getAuthor()+", "+bookArray3[i].getBookName());
		}
		
		bookArray1[1].setBookName("돼지갈비는 맛있다");
		bookArray1[1].setAuthor("갈리뚱띠");
		
		System.out.println("원본 : "+bookArray1[1].getAuthor()+", "+bookArray1[1].getBookName());
		System.out.println("얕은 복사 : "+bookArray2[1].getAuthor()+", "+bookArray2[1].getBookName());
		System.out.println("깊은 복사 : "+bookArray3[1].getAuthor()+", "+bookArray3[1].getBookName());

	}

}
