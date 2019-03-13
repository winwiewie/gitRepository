package shopping.test;

import shopping.product.*;
import shopping.user.Buyer;

public class ShopTest1 {
	public static void main(String[] args) {
		

		
		Buyer user1 =  new Buyer("홍길동",10000);
		Buyer user2 =  new Buyer("제우스",1000);
		
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		
		
		
		user1.buy(tv1);
		user1.buy(com1);
		
		user1.showProductInfo();
		System.out.println(user1);
		
		user2.buy(tv1);
		user2.buy(com1);
		
		user2.showProductInfo();
		System.out.println(user2);
		
		

	}
}
