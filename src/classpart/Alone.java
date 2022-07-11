package classpart;

public class Alone {

	public static void main(String[] args) {
		Man man1 = new Man();
		man1.age = 40;
		man1.name = "James";
		man1.isMarried = true;
		man1.kidCount = 3;
		
		System.out.println("나이 : "+man1.age);
		System.out.println("이름 : "+man1.name);
		System.out.println("결혼 여부 : "+man1.isMarried);
		System.out.println("자녀 수 : "+man1.kidCount);
		System.out.println();
		
		Shopping shopping1 = new Shopping();
		shopping1.orderNum = 201803120001L;
		shopping1.ordererID = "abc123";
		shopping1.orderDate = "2018년 3월 12일";
		shopping1.ordererName = "홍길순";
		shopping1.orderProductNum = "PD0345-12";
		shopping1.deliveryAdd = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+shopping1.orderNum);
		System.out.println("주문자 아이디 : "+shopping1.ordererID);
		System.out.println("주문 날짜 : "+shopping1.orderDate);
		System.out.println("주문자 이름 : "+shopping1.ordererName);
		System.out.println("주문 상품 번호 : "+shopping1.orderProductNum);
		System.out.println("배송 주소 : "+shopping1.deliveryAdd);
		

	}

}
