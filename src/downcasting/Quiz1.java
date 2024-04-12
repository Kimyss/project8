package downcasting;
/*
 * 리스트 하나생성 
 * 리스트에 사람, 호랑이, 독수리 하나씩추가
 * 
 * 반복적으로 리스트에 저장된 요소를 하나씩 꺼내서
 * 사람가지고있는 메소드, 호랑이 메소드, 독수리 메소드 출력
 */

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

//		Animal 타입의 리스트를 생성하면, 사람 호랑이 독수리 저장가능
		ArrayList<Animal> animal = new ArrayList<Animal>();

		animal.add(new Human());
		animal.add(new Tiger());
		animal.add(new Eagle());

		for (int i = 0; i < animal.size(); i++) {

			Animal ani = animal.get(i); // 배열의 요소를 꺼내서 Animal형 변수에 저장

			if (ani instanceof Human) { // 인스턴스의 타입이 Human형이면
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) { // 인스턴스의 타입이 Tiger형이면
				Tiger t = (Tiger) ani; // Tiger형으로 다운캐스팅
				t.hunting();
			} else if (ani instanceof Eagle) { // 인스턴스의 타입이 Eagle형이면
				Eagle e = (Eagle) ani; // Eagle형으로 다운캐스팅
				e.flying();
			}
		}
		
		
//		Animal animal1 = new Human();
//		
//		if (animal1 instanceof Human) {
//			Human Human = (Human) animal1;
//			Human.readBook();
//		}
//		
//		Animal animal2 = new Tiger();
//		
//		if(animal2 instanceof Tiger) {
//			Tiger Tiger = (Tiger) animal2;
//			Tiger.hunting();
//		}
		
	}

}
