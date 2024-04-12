package downcasting;

import java.util.ArrayList;

/*
 * 아래 그림은 사람와 학생, 회사원 클래스의 상속관계를 표현한 것입니다.
 * 상속관계와 테스트 코드를 참고하여 다음과 같이 테스트 결과를 출력하세요.
 * Person형으로 리스트를 생성하고 학생과 회사원을 1명씩 저장하세요.
 * 그리고 리스트에 저장된 학생과 회사원을 꺼내서 가지고 있는 모든 기능을 호출하세요
 * */

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();	//부모타입으로 리스트만들고
		
		list.add(new Student("학생"));
		list.add(new OfficeMan("오피스맨"));
		
		
	}

}

class Person{
	String name;
	
	public Person(String name) {		//기본(?)생성자 void도 안들어가도 되네 static언제쓰고 언제안쓰고
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + " 밥 먹는다");
	}
}

class Student extends Person{
	
	public Student(String name) {
		super(name);
	}

	public void study() {		//자식클래스 고유기능
		System.out.println(name + " 공부 한다");
	}
}

class OfficeMan extends Person{
	
	public OfficeMan(String name) {
		super(name);
	}

	public void work() {		//자식클래스 고유기능
		System.out.println(name + " 일을한다");
	}
}
