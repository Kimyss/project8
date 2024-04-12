package inheritance.quiz;

//베이직티비(BasicTV)을 정의하는 클래스를 만드세요.
//속성: 전원상태, 채널, 볼륨
//
//베이직티비 클래스를 상속받는 스마트티비(SmartTV) 클래스를 만드세요.
//속성: 아이피
//
//베이직티비 인스턴스를 생성하세요. (전원 상태:on, 채널:7, 볼륨:20)
//스마트티비 인스턴스를 생성하세요. (전원 상태:on, 채널:11, 볼륨:30, 아이피:192.168.0.111)
//모든 인스턴스의 정보를 출력하세요

public class Quiz2 {

	public static void main(String[] args) {
		
		BasicTV basicTv = new BasicTV();
		basicTv.onOff = true;
		basicTv.ch = 7;
		basicTv.vol = 20;
		
		basicTv.showInfo();
		
		System.out.println();
		
		SmartTV smartTv = new SmartTV();
		smartTv.onOff = true;
		smartTv.ch = 11;
		smartTv.vol = 30;
		smartTv.ip = "192.168.0.111";
		
		smartTv.showInfo();
		
		

	}

}

class BasicTV{
	Boolean onOff;
	int ch;
	int vol;
	
	public void showInfo() {
		System.out.println("전원:" + onOff);
		System.out.println("채널:" + ch);
		System.out.println("볼륨:" + vol);
	}
}

class SmartTV extends BasicTV{
	String ip;
	
	public void showInfo() {
		System.out.println("전원:" + onOff);
		System.out.println("채널:" + ch);
		System.out.println("볼륨:" + vol);
		System.out.println("ip주소:" + ip);
	}
}
