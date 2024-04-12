package typecasting;

/*
 * 아래 그림은 부모와 자식 클래스의 상속관계를 표현한 것입니다.
 * 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
 * 단, 부모클래스 참조변수를 선언하고 자식 클래스로 생성한 인스턴스를 대입하세요.
 * 그리고 자식클래스의 정보를 출력하세요. 
 * */

public class Quiz1 {

	public static void main(String[] args) {

		Parents ch = new Child("한국", "고", "길동");

		System.out.println(ch.lastName); // pc변수는 Parents클래스의 멤버변수만 사용할 수 있음
		System.out.println(ch.nation);
		// System.out.println(pc.firstName); //pc변수로 자식클래스의 이름은 사용할 수 없음

	}

}

class Parents {
	String nation;
	String lastName;

//	국적과 성을 입력받아 인스턴스를 생성하는 생성자 => => 생성자 만들었기에 디폴트생성자는 만들어지지 X
	public Parents(String nation, String lastName) {
		this.nation = nation; // 멤버변수 지역변수 같아도 색상구분으로 뚜렷
		this.lastName = lastName; // 파랭이 멤버, 갈색이 지역
	}
}

class Child extends Parents {
	String firstName;

	public Child(String nation, String lastName, String firstName) {
		super(nation, lastName);
//		부모에 디폴트생성자가 없으므로 super() 코드 생략불가
		this.firstName = firstName;

	}
}
