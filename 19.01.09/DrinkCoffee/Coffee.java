
public class Coffee extends Drink{

	int Caffeine = 0;
	
	Coffee(){
		
	}
	
	void info() {
		System.out.println("커피이름: " + name);
		System.out.println("용량 " + volume + "ml");
		System.out.println("가격 " + price);
		System.out.println("카페인  " + Caffeine + "%");
	}
}
