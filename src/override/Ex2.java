package override;

public class Ex2 {

	public static void main(String[] args) {
		
		Customer vc = new VIPCustomer("김뷔");
		
		vc.calcPrice(10000);	
//		참조변수타입이 부모 커스터머이기떄문에 커스터머(부모)가리킴
//		자동컴파일 되어 자식클래스	디버깅요망

	}

}
