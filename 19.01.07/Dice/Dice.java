
public class Dice {

	int dice = 0;
	
	Dice(){
		
	}
	void diceThrow() {
		System.out.println("주사위를 던집니다.");
		dice = (int)(Math.random() * 6) + 1;
		
	
	}
	void diceView() {
		System.out.println("나온 숫자는 "+ dice + " 입니다.");
	}
	
}
