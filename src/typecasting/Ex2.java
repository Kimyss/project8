package typecasting;

public class Ex2 {

	public static void main(String[] args) {
		
		VIPCustomer2 vip = new VIPCustomer2("김브이");		//인스턴스 생성 !
		
		
	}

}

//일반회원 클래스
class Customer2 {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer2(String custorName) {
		this.customerName = custorName;		//회원의 이름을 매개변수로 받고 초기화 해줌
		customerGrade = "SILVER"; // 고정값이니 초기화
		bonusRatio = 0.01; // static으로 주지않는 이유...? vip에서 상속을 받아야하기 때문에
		System.out.println("Custormer() 생성자 호출" );
	}

//포인트 적립하고, 지불 가격 계산하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio); // 전달받은 가격 * 0.01(1%)에 포인트 누적
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + "님의 등급은" + customerGrade + "이며, 포인트는 " + bonusPoint + " 입니다.");
	}
}

//VIP클래스
class VIPCustomer2 extends Customer2 {
	double saleRatio; // 할인률

	public VIPCustomer2(String customerName) {		
		super(customerName);	//부모의 생성자와 형태가 같아지기 때문에(괄호안에 인자) 에러 사라짐. 디폴트생성자: 생략가능, 디폴트 X: 꼭 써주어야한다
		customerName = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
		System.out.println("VIPCustomer() 생성자 호출");
	}
}
