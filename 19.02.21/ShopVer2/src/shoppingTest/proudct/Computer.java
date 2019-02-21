package shoppingTest.proudct;

public class Computer extends Product{

	public Computer(){
		super(200);
		name = "Computer";
	}
	
	public Computer(String name,int price) {
		super(name, price);
	}
	
//	public String toString() {
//	return "Computer";
//}
	
}
