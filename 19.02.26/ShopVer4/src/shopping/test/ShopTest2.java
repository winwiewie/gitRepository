package shopping.test;

import java.util.Scanner;

import shopping.product.*;
import shopping.user.Buyer;

public class ShopTest2 {
	public static void main(String[] args) {
		
		Buyer[] userArr = new Buyer[2];

		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		
		String name = "";
		int money = 0;
		
		Scanner scan = new Scanner(System.in);

		try {
			for (int i = 0; i < userArr.length; i++) {
				System.out.println("구매자의 이름을 입력해주세요");
				name = scan.nextLine();
				System.out.println(name + "님의 소지금을  입력해주세요");
				money = Integer.parseInt(scan.nextLine());


				userArr[i] = new Buyer(name,money);
			}
		} catch (Exception e) {
			System.out.println("소지금은 숫자만 입력해 주세요");
		}

//		userArr[0].name = "홍길동";
//		userArr[1].name = "제우스";
//		
//		userArr[0].money = 10000;
//		userArr[1].money = 1000;

		for (int i = 0; i < userArr.length; i++) {
			userArr[i].buy(tv1);
		}
		
		for (int i = 0; i < userArr.length; i++) {
			userArr[i].buy(com1);
		}
		
		for (int i = 0; i < userArr.length; i++) {
			userArr[i].showProductInfo();
		}
	}
}
