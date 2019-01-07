

// 생성자(Construct)
// 생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'이다.
// 따라서 인스턴스 변수의 초기화 작업에 주로 사용되며,
// 인스턴스 생성 시에 실행되어야 할 작업을 위해서도 사용된다

// 생성자 생성 방법
// 1. 생성자의 이름은 클래스의 이름과 같아야 한다.
// 2. 생성자는 리턴 값이 없다.

// 주의사항
// 기본생성자가 컴파일러에 의해서 추가되는 경우는
// 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card card = new Card();
		Card card1 = new Card(1);
		Card card12 = new Card(1, 2);
		Card2 card2 = new Card2();
		
		System.out.println(card.number);
		System.out.println(card1.number);
		System.out.println(card12.number);
		
		System.out.println(card2.number);
	}

}
