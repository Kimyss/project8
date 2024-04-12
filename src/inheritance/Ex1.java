package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.nationality = "한국";
		
		child.lastName = "홍";
		
		child.firstName = "길동";
		

	}

}

//부모 클래스
class Parents{
	String nationality;		//국적
	String lastName;		//성
}


//자식 클래스
//class child{}
//부모의 속성을 물려받고 싶다면 상속관계를 맺어야 - 자식이름 + extends + 부모이름
class Child extends Parents{
	String firstName;		//이름
	
}

