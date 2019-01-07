
public class Car{
	
	String color = "";		// 색상
	String gearType = "";	// 변속기 종류
	int door = 0;			// 자동차 문의 개수
	
//	생성자
	Car(){
		
	}
				
	Car(String carRgb,String carGear, int carDoor){
		gearType = carGear;
		door = carDoor;
		color = carRgb;
	}

}
