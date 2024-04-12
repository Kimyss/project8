package typecasting;


public class Ex1 {

	public static void main(String[] args) {
		
		VIPCustomer vip =new VIPCustomer();
		

	}

}

//일반회원 클래스
class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer() {
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
class VIPCustomer extends Customer {
	double saleRatio; // 할인률

	public VIPCustomer() {
		super();	//생략을 해도 괜찮긴함, 부모를 가리킨다 =Custormer. Custormer의 생성자를 호출하겠다.
		customerName = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
		System.out.println("VIPCustomer() 생성자 호출");
	}
}
