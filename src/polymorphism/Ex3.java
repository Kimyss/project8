package polymorphism;


public class Ex3 {

	public static void main(String[] args) {
		
		moveAnimal(new Human()); 	//Animal animal = new Human() 
		moveAnimal(new Tiger()); 	//Animal animal = new Tiger() 
		moveAnimal(new Eagle()); 	//Animal animal = new Eagle()
	}
	
	public static void moveAnimal(Animal animal) { //자식클래스인 사람,호랑이,독수리를 받을 수 있음
		animal.move(); // 재정의된 메소드가 호출 => 주소값의 복사
	} 
}

