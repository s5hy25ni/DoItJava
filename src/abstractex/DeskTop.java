package abstractex;

public class DeskTop extends Computer{
	
	// Add unimplement methods
	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");		
	}

}