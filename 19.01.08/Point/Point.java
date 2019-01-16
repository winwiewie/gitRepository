
// 오버라이딩(overRiding) -> 메서드 재정의
// 부모에 맞게 재정의 하면  부모걸 안갖고와도 됨

public class Point {

	int x = 0;
	int y = 0;
	
	String getLocation() {
		
		return "x: " + x + ", y :" + y;
	}

}
