package test.proudct;

public class Tv extends Product{

	public Tv(){
		//조상 클래스의 생성자 Product(int price)를 호출한다
		super(100);		// Tv의 가격을 100만원으로 한다
		name = "Tv";
	}
	
	public Tv(String name,int price) {
		super(name, price);
	}
	
	public String toString() {
		String str = "";
		str = str + name + "\n";
		str = str + price + "\n";
		str = str + bonusPoint + "\n";
		
		return str;
	}
	
//	public String toString() {	//Object클래스의 toString()을 오버라이딩한다.
//		return "Tv";
//	}
}
