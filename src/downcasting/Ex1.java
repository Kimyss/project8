package downcasting;

public class Ex1 {

	public static void main(String[] args) {
		
//		부모타입으로 형변환
		Animal animal = new Human();
//		animal.readBook 사용불가 downcasting 요망
		
		if (animal instanceof Human) {
			Human Human = (Human) animal;
			Human.readBook();
		}

//		타입을 확인해야하는 이유: 컴파일 오류는 안나고 런타임오류가남
		Tiger tiger = (Tiger) animal;
		Eagle eagle = (Eagle) animal;
		
		if (animal instanceof Tiger) {
			Tiger Tiger = (Tiger) tiger;
			Tiger.move();
		}
		
	}

}


//동물 클래스
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

//사람 클래스
class Human extends Animal{		//동물클래스 상속받기
	public void move() {		//메소드 재정의
		System.out.println("사람 두발로 걸어요");
	}
	public void readBook() {
		System.out.println("사람이 책 읽어요");
	}
}

//호랑이 클래스
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뛰어요");
	}
	public void hunting() {
		System.out.println("호랑이 사냥해요");
	}
}

//독수리 클래스
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리 하늘 날아요");
	}
	public void flying() {
		System.out.println("독수리 날아요");
	}
}
