

// Object
// 최상위 객체 -> 조상

// 계층 관계도
// Object ->  Tv  ->  CaptionTv
// 조상(기원)		  아버지		자식

public class Tv extends Object{

	boolean power = false;
	int channel = 0;
	
	Tv(){
		
	}
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void tvInfo() {
		System.out.println("일반 TV");
		System.out.println("전원 상태 : " + power);
		System.out.println("채널 값 : " + channel);
	}
}
