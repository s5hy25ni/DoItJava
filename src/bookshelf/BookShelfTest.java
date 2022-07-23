package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("ÅÂ¹é»ê¸Æ 1");
		shelfQueue.enQueue("ÅÂ¹é»ê¸Æ 2");
		shelfQueue.enQueue("ÅÂ¹é»ê¸Æ 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	}
}