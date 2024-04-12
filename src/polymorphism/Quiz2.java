package polymorphism;

import java.util.ArrayList;

/*	
 * 	쇼핑몰에 회원이 늘어 GOLD 회원 등급을 하나 추가합니다.
 * - 제품을 살 때 10%를 할인해준다.
 * - 보너스 포인트를 2% 적립해준다.
 * 리스트를 생성하고 일반회원, 골드회원, VIP 회원을 1명씩 총 3명 저장하세요.
 * 모든 회원은 10000원짜리 제품을 구매합니다
 * */
public class Quiz2 {

	public static void main(String[] args) {
		
//		자료형을 Customer로 지정
		ArrayList<Customer> customerList = new  ArrayList<Customer>();
		
		customerList.add(new Customer("둘리"));
		
		Customer customer2 = new VIPCustomer("또치");
		customerList.add(customer2);
		
		Customer customer3 = new GoldCustomer("또치");
		customerList.add(customer2);
		customer3.calcPrice(10000);
		customer3.showInfo();
		
		
		
		
		

	}

}

class GoldCustomer extends Customer {
	double saleRatio;

	public GoldCustomer(String customerName) {
//		super();	사용불가
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override // 재정의 (할인율에대한)
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}

}