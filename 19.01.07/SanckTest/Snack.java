
public class Snack {

	String name = "";
	int price = 0;
	String maker = "";
	
	Snack(String name,int price, String maker){
		this.name=name;
		this.price=price;
		this.maker=maker;
		SnackBox.snackCount(this);
	}
	
	void snackPrint() {
		System.out.println("과자 이름 : " + name );
		System.out.println("과자 가격 : " + price );
		System.out.println("제  소  사 : " + maker );
	}
	
	
	
}
