package shopping.product;

public class Computer extends Product{

	public Computer(){
		super(200);
	}
	
//	public String toString() {
//		return "Computer";
//	}
	
	@Override
	public String toString() {
		return "Computer [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}
