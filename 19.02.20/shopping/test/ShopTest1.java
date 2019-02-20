package shopping.test;

import shopping.Product.*;
import shopping.user.Buyer;

public class ShopTest1 {
	public static void main(String[] args) {
		
		Buyer user1 = new Buyer();
		
		Tv tv1 = new Tv();
		user1.buy(tv1);
		
		System.out.println("Tv를 구매한후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + user1.bousPoint + "점입니다.");
		
		
		System.out.println();
		Computer computer1 = new Computer();
		user1.buy(computer1);
		
		System.out.println("Computer를 구매한후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + user1.bousPoint + "점입니다.");
		
		
	}
}
