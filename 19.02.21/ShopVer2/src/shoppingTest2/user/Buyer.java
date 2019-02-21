package shoppingTest2.user;

import shoppingTest2.proudct.*;


public class Buyer {

	public String name = "";
	public int money = 0;
	public int bousPoint = 0;
	

	public Buyer(){
		
	}
	
	public Buyer(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product product) {
		
		System.out.println(name + "님" );
		System.out.println(product.name + "의 가격은 " + product.price + "만원입니다.");
		System.out.println();
		
		if(money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println();
			return;
		}
		
		money = money - product.price;	// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bousPoint = bousPoint + product.bonusPoint;	// 제품의 보너스 점수를 추가한다.

		System.out.println(product.name + "를 구입하셨습니다.");
		System.out.println(product.name + "를 구매한후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + money + "만원 입니다");
		System.out.println("현재 보너스 점수는  " + bousPoint + "점 입니다.");

		System.out.println();

	}
	
}
