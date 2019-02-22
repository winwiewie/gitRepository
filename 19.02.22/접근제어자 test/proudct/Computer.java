package test.proudct;

public class Computer extends Product{

	public Computer(){
		super(200);
		name = "Computer";
	}
	
	public Computer(String name,int price) {
		super(name, price);
	}
	public String toString() {
		String str = "";
		str = str + name + "\n";
		str = str + price + "\n";
		str = str + bonusPoint + "\n";
		
		return str;
	}
	
//	public String toString() {
//	return "Computer";
//}
	
}
