package test.proudct;

public class Product {
	
	protected String name;
	protected int price;	// 제품의 가격
	protected int bonusPoint;		// 제품구매시 제공하는 보너스 점수

	
//------------------------------- 제품이름 -------------------------------
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
//------------------------------- 제품의 가격 -------------------------------
	public void setPrice(int price) {
		 this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
//------------------------------- 제품구매시 제공하는 보너스 점수 -------------------------------
	public void setBousPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public int getBousPoint(int bonusPoint) {
		return bonusPoint;
	}
//------------------------------- toString -------------------------------	
	public String toString() {
		String str = "";
		str = str + name + "\n";
		str = str + price + "\n";
		str = str + bonusPoint + "\n";
		
		return str;
	}

	public Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 보너스 점수는 제품가격의 10%
		
	}
	public Product(String name,int price ){
		this.name = name;
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 보너스 점수는 제품가격의 10%
		
	}
	
	
}
