package shopping.user;

import shopping.Product.*;

public class Buyer2 {

	public int money = 1000;
	public int bousPoint = 0;
	
	public void buy(Tv tv) {
		if(money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		
		money = money - tv.price;	// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bousPoint = bousPoint + tv.bousPoint;	// 제품의 보너스 점수를 추가한다.
		System.out.println(tv.myProuctName() + "를 구입하셨습니다.");
	}
	
	public void buy(Computer computer) {
		if(money < computer.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		String myProuctName = ""; 
		myProuctName = computer.myProuctName();
		
		money = money - computer.price;
		bousPoint = bousPoint + computer.bousPoint;
		System.out.println(myProuctName + "를 구입하셨습니다.");
	}
	
	public void buy(Notebook notebook) {
		if(money < notebook.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		String myProuctName = ""; 
		myProuctName = notebook.myProuctName();
		
		money = money - notebook.price;
		bousPoint = bousPoint + notebook.bousPoint;
		System.out.println(myProuctName + "를 구입하셨습니다.");
	}
}
