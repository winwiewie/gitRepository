package shopping.user;

import shopping.product.*;

public class Buyer {
	
	public String name = "김충현";
	public int money = 400;
	public int bousPoint = 0;
	
	public void buy(Product product) {
		if(money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액 : " + (product.price - money));
			System.out.println();
			return;
		}
		
		money = money - product.price;	// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bousPoint = bousPoint + product.bousPoint;	// 제품의 보너스 점수를 추가한다.

		String myProuctName = ""; 
		myProuctName = product.myProuctName();
		System.out.println(myProuctName + "를 구입하셨습니다.");
	}
	
	
}
