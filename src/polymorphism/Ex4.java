package polymorphism;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
//		회원리스트 생성
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("둘리");		//일반회원
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도너");
		Customer customer4 = new VIPCustomer("마이콜");	//vip회원
		Customer customer5 = new VIPCustomer("고길동");
		
		customerList.add(customer1);	//리스트에 회원추가
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		for(Customer customer : customerList) {		
			//람다식포문 변수 : 리스트  	=> 리스트 순회, 마지막 배열 만날때까지
			customer.calcPrice(10000);
		}
		
//		 VIPCustimer은 마지막 두 배열의 VIP만 가리킨다
//		for(VIPCustomer customer : customerList) {		
//			customer.calcPrice(10000);
//		}
		
		
		for (Customer customer : customerList) {
			customer.showInfo(); //고객정보 출력
		}
	}

}
