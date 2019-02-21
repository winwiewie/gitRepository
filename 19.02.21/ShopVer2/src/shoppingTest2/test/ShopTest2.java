package shoppingTest2.test;


import java.util.Scanner;

import shoppingTest2.proudct.*;
import shoppingTest2.user.*;



public class ShopTest2 {
	public static void main(String[] args) {
		
//		구매자는 
//		이름이 존재한다
//
//		Tv, Computer와 같은 제품
//		자바책, 만화책와 같은 책 
//
//		main 작동 방식 실행 순서
//		자신의 이름, 소지금 20000
//
//		Tv중에 조은Tv는 가격이 100이다
//		Com중에 조은 컴퓨터는 가격이 400이다
//		책중에 자바책의 이름은 자바의정석 가격은 10000
//		만화책 OnePiece 4000
//
//		모든 물건 하나씩 구매하시오

		Scanner scanner = new Scanner(System.in);
		
		Buyer user = new Buyer("김충현", 20000);
		Book java = new Book("자바의정석", 10000);
		Book onepice = new Book("OnePice", 4000);
		Computer likeComputer = new Computer("조은 컴퓨터", 400);
		Computer computer = new Computer();
		Tv tv = new Tv();
		
		System.out.println(user.name + "님");
		System.out.println("현재 가지고 있는돈은 " + user.money + "만원 이고");
		System.out.println("현재 보너스 포인트는 " + user.bousPoint + "점 입니다.");
		System.out.println();
		
		user.buy(java);
		user.buy(onepice);
		user.buy(likeComputer);
		user.buy(computer);
		user.buy(tv);
		
		
	}
}
