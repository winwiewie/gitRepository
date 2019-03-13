package shopping.test2;

public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		Customer jangHungIl 	= new Customer("장훈일", 39, 2000000);
		Customer parkDaseSung 	= new Customer("박대승", 25,  800000);
		Customer yoonSeungHwan 	= new Customer("윤승환", 28, 1200000);
		Customer jungMinSung 	= new Customer("정민성", 28, 1900000);
		Customer leeMyungsun 	= new Customer("이명선", 26, 1800000);
		
		Customer kimJunhyuk 	= new Customer("김준혁", 32, 4000000);
		Customer parkGangIn 	= new Customer("박강인", 36, 3500000);
		Customer choHyeSun 		= new Customer("조혜선", 23, 1000000);
		Customer chungmHyeMi 	= new Customer("정혜미", 36, 5000000);
		Customer choiMunWon 	= new Customer("최문권", 28,  700000);
		
		
		ProductStore computerStore	 = new ProductStore("최고의 컴퓨터", 1000000);
		ProductStore appleStore		 = new ProductStore("거창 사과",       8000);
		ProductStore houseStore		 = new ProductStore("최고의 전세방", 3000000);
		ProductStore tvStore 		 = new ProductStore("최고의 Tv",    4000000);
		ProductStore airconStore	 = new ProductStore("최고의 에어컨", 4000000);
		ProductStore notAirconStore	 = new ProductStore("꾸진 에어컨",    800000);
		
		
		computerStore.buy(jangHungIl);
		computerStore.buy(parkDaseSung);
		computerStore.buy(yoonSeungHwan);
		computerStore.buy(jungMinSung);
		computerStore.buy(leeMyungsun);
		
		
		appleStore.buy(kimJunhyuk);
		houseStore.buy(parkGangIn);
		tvStore.buy(choHyeSun);
		airconStore.buy(chungmHyeMi);
		notAirconStore.buy(choiMunWon);
		
		
		System.out.println();
		
		System.out.println(jangHungIl);
		System.out.println(parkDaseSung);
		System.out.println(yoonSeungHwan);
		System.out.println(jungMinSung);
		System.out.println(parkGangIn);
		
		
		System.out.println(kimJunhyuk);
		System.out.println(parkGangIn);
		System.out.println(choHyeSun);
		System.out.println(chungmHyeMi);
		System.out.println(choiMunWon);
		
		System.out.println();
		
		System.out.println("가게이름 : "+ computerStore.productName + "\n" + "제품의 가격 : " + computerStore.price 
				+ "\n" + "가게의 소지금 : " + computerStore.storeMoney + "\n");
		
		System.out.println("가게이름 : "+ appleStore.productName + "\n" + "제품의 가격 : " + appleStore.price 
				+ "\n" + "가게의 소지금 : " + appleStore.storeMoney  + "\n");
		
		System.out.println("가게이름 : "+ houseStore.productName + "\n" + "제품의 가격 : " + houseStore.price 
				+ "\n" + "가게의 소지금 : " + houseStore.storeMoney  + "\n");
		
		System.out.println("가게이름 : "+ tvStore.productName + "\n" + "제품의 가격 : " + tvStore.price 
				+ "\n" + "가게의 소지금 : " + tvStore.storeMoney + "\n");
		
		System.out.println("가게이름 : "+ airconStore.productName + "\n" +"제품의 가격 : " + airconStore.price 
				+ "\n" + "가게의 소지금 : " + airconStore.storeMoney  + "\n");
		
		System.out.println("가게이름 : "+ notAirconStore.productName + "\n" + "제품의 가격 : " + notAirconStore.price 
				+ "\n" + "가게의 소지금 : " + notAirconStore.storeMoney  + "\n");

		
		
	}

}
