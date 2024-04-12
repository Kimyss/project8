package polymorphism;
/*
 * 자동차, 버스, 스포츠카 클래스를 정의하세요.
 * 자동차 클래스에서 상속받는 메소드를 재정의하세요 run()
 * 버스와 스포츠카 객체를 매개변수로 받는 메소드를 정의하고 run()메소드를 호출하세요.
 * */
public class Quiz1 {
	
	public static void main(String[] args) {
		runCar(new Bus()); // Car car = new Bus() 식이 성립됨
		runCar(new SportsCar());
	}

//	1. 부모 타입의 매개변수를 사용해서 자식클래스인 버스와 스포츠카를 받기
	public static void runCar(Car car) { // 자식클래스인 버스,스포츠카를 받을 수 있음
		car.run(); // 재정의된 메소드가 호출됨
	}

	
//	2. 또는(다형성활용X면, 각 클래스 타입의 매개변수로 메소드 만들기
//	public static void runCar(Bus bus) {
//		bus.run();
//	}
//
//	public static void runCar(SportsCar sportsCar) {
//		sportsCar.run();
//	}

}

// 자동차 클래스
class Car {
	public void run() {
		System.out.println("자동차가 달린다");
	}
}

// 버스 클래스
class Bus extends Car { // 상속받기

	@Override
	public void run() { // 메소드 재정의
		System.out.println("버스 달린다");
	}

}

// 스포츠카 클래스
class SportsCar extends Car { // 상속받기
	@Override
	public void run() { // 메소드 재정의
		System.out.println("스포츠카 달린다");
	}
}
