

//	상속, 캡슐화, 다형성
// 	상속(inheritance)
// 	상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.

// 	표현식
//	class 자식 클래스 extends 부모 클래스{
//
// 	}
//	부르는 용어
//	조상 클래스, 부모 클래스, 상위 클래스
//	자손 클래스, 자식 클래스, 하위 클래스, 파생된 클래스

//	상속을 받는다는 것은 조상 클래스를 확장한다는 의미로 해석할 수도 있으며
//	이것이 상속에 사용되는 키워드가 extends인 이유이기도 하다.
//	- 생성자는 상속되지 않는다. 멤버만 상속된다.
//	- 자손 클래스의 맴버 개수는 조상 클래스보다 항상 같거나 많다.

public class RemoteController{
	
	int channel = 0;
}
