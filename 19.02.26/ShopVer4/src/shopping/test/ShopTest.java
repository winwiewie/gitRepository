package shopping.test;

import shopping.product.*;
import shopping.user.Buyer;

public class ShopTest {
	public static void main(String[] args) {
		
		Buyer user1 = new Buyer();
		
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		
		user1.buy(tv1);
		user1.buy(com1);
		
		System.out.println("Tv를 구매한후 사용자의 정보");
		System.out.println(user1);
		
	}
}
