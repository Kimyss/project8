package override;


public class Ex1 {

	public static void main(String[] args) {
		
		Customer customer = new Customer("김일반");
		
		customer.calcPrice(10000);
		customer.showInfo();
		
		System.out.println();
		
		VIPCustomer vip = new VIPCustomer("김실버");
		vip.calcPrice(10000);
		vip.showInfo();
		

	}

}

class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer(String custorName) {
		this.customerName = custorName;		//회원의 이름을 매개변수로 받고 초기화 해줌
		customerGrade = "SILVER"; // 고정값이니 초기화
		bonusRatio = 0.01; // static으로 주지않는 이유...? vip에서 상속을 받아야하기 때문에
//		System.out.println("Custormer() 생성자 호출" );
	}

//포인트 적립하고, 지불 가격 계산하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio); 
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
		System.out.println(customerName + "님의 등급은" + customerGrade + "이며, 포인트는 " + bonusPoint + " 입니다.");
	}
}

//VIP클래스
class VIPCustomer extends Customer {
	double saleRatio; // 할인률

	public VIPCustomer(String customerName) {		
		super(customerName);	//부모의 생성자와 형태가 같아지기 때문에(괄호안에 인자) 에러 사라짐. 디폴트생성자: 생략가능, 디폴트 X: 꼭 써주어야한다
		customerName = "VIP";
		bonusRatio = 0.05; // 5%
		saleRatio = 0.1; // 10%
//		System.out.println("VIPCustomer() 생성자 호출");
	}

	@Override
	public void calcPrice(int price) {		//선언부 형태 부모와 같아야 한다 
//		super.calcPrice(price);		=> vip 기준에 맞게 수정요망
		bonusPoint = bonusPoint + (price * bonusRatio);		
		
		int salePrice = price -(int)(price * saleRatio);		//할인률 반영
		System.out.println(customerName + "님이 " + salePrice + "원을 결제하였습니다." );
	}
	
	
}
