package shopping.test;

import shopping.Product.*;
import shopping.user.*;

public class ShopTest2 {
	public static void main(String[] args) {
		
		Buyer2 user1 = new Buyer2();
		
		Tv tv1 = new Tv();
		user1.buy(tv1);
		
		System.out.println("Tv를 구매한후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + user1.bousPoint + "점입니다.");
		
		System.out.println("-----------------------------------");
		Notebook notebook1 = new Notebook();
		user1.buy(notebook1);
		
		System.out.println("Notebook를 구매한후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + user1.bousPoint + "점입니다.");
		
		System.out.println("-----------------------------------");
		Computer computer1 = new Computer();
		user1.buy(computer1);
		
		System.out.println("Computer를 구매한후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + user1.bousPoint + "점입니다.");
		
		
	}
}
