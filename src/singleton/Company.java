package singleton;

public class Company {
	private static Company instance = new Company(); // (2) 유일하게 생성한 인스턴스
	private Company() {} // (1) private 생성자 만들기(디폴트는 public)
	
	public static Company getInstance() { // (3) 외부에서 참조할 수 있도록 public 메서드 만들기
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
