package shoppingTest.proudct;

public class Product {
	
	public int price;	// 제품의 가격
	public int bousPoint;		// 제품구매시 제공하는 보너스 점수
	public String name;
	
	public Product(int price){
		this.price = price;
		bousPoint = (int)(price / 10.0); // 보너스 점수는 제품가격의 10%
		
	}
	public Product(String name,int price ){
		this.name = name;
		this.price = price;
		bousPoint = (int)(price / 10.0); // 보너스 점수는 제품가격의 10%
		
	}
}
