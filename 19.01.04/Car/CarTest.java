
public class CarTest {

	public static void main(String[] args) {
		
		String color = "";		
		String gearType = "";	
		int door = 0;			
		
		color = "white";
		gearType = "auto";
		door = 4;
		
		Car car = new Car(color, gearType, door);

		
		System.out.println("색상은 " + car.color);
		System.out.println("변속기의 종류는 "+ car.gearType);
		System.out.println("문의 개수는 " + car.door);
		System.out.println("인 자동차를 만들었습니다.");
		
	}
}
