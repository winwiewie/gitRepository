package shopping.product;

public class Notebook extends Product{

	public Notebook(){
		super(300);
	}
	
//	public String toString() {
//		return "노트북";
//	}
	
	@Override
	public String toString() {
		return "Notebook [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
}
