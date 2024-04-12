package inheritance.quiz;

//아래 그림은 펜과 볼펜,만년필 클래스의 상속관계를 표현한 것입니다.
//다음과 같이 클래스를 구현하고, 객체를 생성하세요.

public class Quiz3 {

	public static void main(String[] args) {
		
		BallPen ballPen =  new BallPen();
		ballPen.size = 2;
		ballPen.leftOver = 100;
		ballPen.color = "파랑";
		ballPen.showInfo();
		
		System.out.println();
		
		FountainPen fPen = new FountainPen();
		fPen.size = 3;
		fPen.leftOver = 80;
		fPen.brand = "몽블랑";
		fPen.showInfo();
		
		
		

	}

}

class Pen{
	int size;
	int leftOver;
}

class BallPen extends Pen{
	String color;
	
	public void showInfo(){
		System.out.println("펜의 굵기는 " + size + " 이고 남은 양은" + leftOver + "% 색상은 " + color);
	}
}

class FountainPen extends Pen{
	String brand;
	
	public void showInfo() {
		System.out.println("펜의 굵기는 " + size + " 이고 남은 양은" + leftOver + "% 브랜드는 " + brand);
	}
}
