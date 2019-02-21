package shoppingTest2.proudct;

public class Tv extends Product{

	public Tv(){
		//조상 클래스의 생성자 Product(int price)를 호출한다
		super(100);		// Tv의 가격을 100만원으로 한다
		name = "Tv";
	}
	public Tv(int price) {
		super(price);
		name = "조은 Tv";
	}
	public Tv(String name,int price) {
		super(name, price);
	}
	
//	public String toString() {	//Object클래스의 toString()을 오버라이딩한다.
//		return "Tv";
//	}
}
