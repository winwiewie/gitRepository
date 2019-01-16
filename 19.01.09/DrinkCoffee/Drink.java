
public class Drink {

	String name = "";
	int price = 0;
	int volume = 0;
	
	
	Drink(){
		
	}
	
	void info() {
		System.out.println("음료수 이름: " + name);
		System.out.println("용량  " + volume + "ml");
		System.out.println("가격  " + price);
	}
}
