package witharraylist;

public class MyTest {

	public static void main(String[] args) {
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		VIPCustomer customerYul = new VIPCustomer(10040, "이율곡", 678910);
		
//		System.out.println(customerKim.getSaleRatio()); 사용불가(자료형:Customer)
		System.out.println(customerYul.getSaleRatio());
	}

}
