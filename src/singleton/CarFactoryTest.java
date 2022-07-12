package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		mySonata.setCarNum(123);
		System.out.println(mySonata.getCarNum());

	}

}
