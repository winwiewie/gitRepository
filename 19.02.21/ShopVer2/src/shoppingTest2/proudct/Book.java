package shoppingTest2.proudct;

public class Book extends Product{
	
	public Book(){
		
	}
	
	public Book(String name, int price) {
		
		this.name = name;
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}

}
