package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	// 생성자를 따로 만들지 않으면 자바 컴파일러가 자동으로 제공해준다. 디폴트 생성자.
	public Person(){} 
	// 사람 이름을 매개변수로 입력 받아서 Person  클래스를 생성하는 생성자
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}
