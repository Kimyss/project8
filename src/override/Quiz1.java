package override;

/*
 * 동물, 고양이, 강아지 클래스를 정의하세요.
 * 동물클래스에서 상속받은 메소드를 재정의하세요 eat(), sound()
 * */

public class Quiz1 {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.eat();
		cat.sound();
		
		System.out.println();
		
		Animal dog = new Dog(); 
		dog.eat();
		dog.sound();

	}

}

class Animal{
	
	public void eat() {
		System.out.println("먹이를 먹는다");
	}
	public void sound() {
		System.out.println("짖는다");
	}
}

class Cat extends Animal{

	@Override
	public void eat() {
//		super.eat();		=>재정의 위해 지워
		System.out.println("고양이는 쥐를 먹는다");
	}

	@Override
	public void sound() {
//		super.sound(); 
		System.out.println("고양이는 야옹하고 짖는다");
	}
}

class Dog extends Animal{

	@Override
	public void eat() {
//		super.eat();
		System.out.println("개는 고기 먹는다");
	}

	@Override
	public void sound() {
//		super.sound();
		System.out.println("개는 멍멍 짖는다");
	}
	
}
