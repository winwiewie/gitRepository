
public class Car {

	int door = 0;
	int wheel = 0;
	String gear = "";
	
	CarAi carAi = new CarAi();
	
	Car(){
		
	}
	
	void car(int door,int wheel,String gear) {
		this.door = door;
		this.wheel = wheel;
		this.gear = gear;
	}
	
	void print() {
		System.out.println("자동차 문 : " + door);
		System.out.println("바퀴 갯수 : " + wheel);
		System.out.println("기       어 : " + gear);
//		carai.carAiPrint();
	}
}
