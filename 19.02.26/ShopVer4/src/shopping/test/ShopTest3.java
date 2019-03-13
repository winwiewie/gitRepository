package shopping.test;

import java.util.Scanner;

import shopping.product.*;

import shopping.user.*;

public class ShopTest3 {
	public static void main(String[] args) {
		
		// 구매자는 총4명이다
		// 2명은 아무사람 2명은 자신과 짝의 정보를 입력한다.
		// 2명은 아무나는 아무것도 구매하지 않는다.
		// 나는 물건은 3개 구매한다.
		// 짝을 소질할 수 있는 만큼 구매한다.
		// 모든정보를 출력하시오
		
		Buyer[] userArr = new Buyer[4];

		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		
		String name = "";
		int money = 0;
		
		Scanner scan = new Scanner(System.in);


		for (int i = 0; i < userArr.length; i++) {
			System.out.println("구매자의 이름을 입력해주세요");
			name = scan.nextLine();
			
			System.out.println(name + "님의 소지금을  입력해주세요");
			money = Integer.parseInt(scan.nextLine());

			userArr[i] = new Buyer(name,money);
			
		}
		
//		userArr[2] = new Buyer();
//		userArr[3] = new Buyer();
//		
//		userArr[2].name = "김충현";
//		userArr[3].name = "윤승환";
//		
//		userArr[2].money = 40000;
//		userArr[3].money = 50000;

		
		for (int i = 0; i < 3; i++) {
			userArr[2].buy(tv1);
		}
		
		for (int i = 0; i < 10; i++) {
			userArr[3].buy(com1);
		}
		
		for (int i = 0; i < userArr.length; i++) {
			userArr[i].showProductInfo();
		}
	}
}
