
public class Tvtest2 {

//	기능 -실행
	public static void main(String[] args) {
		
//		표현식
//		클래스명 변수명;				클래스의 객체를 참조하기 위한 참조변수 선언
//		클래스변수명 = new 클래스명();	클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		
		Tv t;
//     클래스  변수;  <- tv클래스에서 t라는 변수를 선언
		
		t = new Tv();
//		변수 = new 클래스
		
		t.channel = 0;		
//			ㄴ f3: 선언문이 있는 장소로 찾아간다
		
		System.out.println("t의 channel 값은 " + t.channel + "입니다.");
		
		t.channel = 7;	
		System.out.println("t의 channel 값은 " + t.channel + "로 변경하였습니다.");
		
		t.channel = 14;	
		System.out.println("t의 channel 값은 " + t.channel + "로 변경하였습니다.");
	}
}
