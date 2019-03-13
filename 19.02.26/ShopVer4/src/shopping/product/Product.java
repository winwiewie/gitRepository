package shopping.product;

public class Product {
	
		
	protected int price;	// 제품의 가격
	protected int bonusPoint;		// 제품구매시 제공하는 보너스 점수
	
	//
	public Product() {
		
	}
	
	public Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 보너스 점수는 제품가격의 10%
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBousPoint() {
		return bonusPoint;
	}

	public void setBousPoint(int bousPoint) {
		this.bonusPoint = bousPoint;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
