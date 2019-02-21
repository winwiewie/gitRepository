package shoppingTest.test;

import java.util.Scanner;

import shoppingTest.proudct.*;
import shoppingTest.user.*;


public class ShopTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		구매자는 이름이 존재한다.
//		Tv Computer와 같은 제품은
//		자신의 이름,소지금 500
//		동기의 이름, 소지금은 사용자의 입력을 받는다.
//		tv중에 조은tv의 가격 100
		
//		아카데미 Tv 가격이 300;
//		Com중에 조은 컴퓨터는 가격이 400이다
//		아카데미com는 가격을 사용자의 입력을 받는다.
//		자신은 소지금 내에서 구매를 한다.
//		동기는 소지금을 벗어나는 구매할동으로 구매하지 못하는 상황을 보여주시오
		
		Buyer user = new Buyer("김충현",500);
		Buyer user1 = new Buyer();
		

		Computer likeComputer = new Computer("조은 컴퓨터",400);
		
		
		Tv academyTv = new Tv("아카데미 Tv",300);
		Tv likeTv = new Tv(100);
		
		System.out.println("동기의 이름을 입력해주세요");
		user1.name = scanner.nextLine();
		
		System.out.println(user1.name + "의 소지금을 입력해주세요");
		user1.money = scanner.nextInt();
		
		System.out.println("아카데미의 컴퓨터 가격을 입력해주세요");
		int price = scanner.nextInt();
		
		
		Computer academyComputer = new Computer("아카데미 com",price);
		System.out.println();

		user.buy(likeTv);
		user.buy(likeComputer);
		
		System.out.println("------------------------");
		user1.buy(academyTv);
		user1.buy(academyComputer);
		user1.buy(likeComputer);
		user1.buy(likeTv);
		
	}
}
