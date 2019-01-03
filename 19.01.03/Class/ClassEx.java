
public class ClassEx {

	void instanceMethod() {

	}

	static void staticMethod() {	// 스태틱 메서드, 클래스 매서트

	}

	void instanceMethod2() {
		instanceMethod();	// 인스턴스 메서드 호출
		staticMethod();		// 스태틱 메서드 호출
	}

	static void staticMethod2() {	// 스태틱 메서드 안에는 인스턴스 매서드를 사용할수 없음
//		instanceMethod();	// 인스턴스 메서드 호출  <- 메인 클래스에서 만들어져야 쓸수 있다.
		staticMethod();	// 스태틱 메서드 호출
	}
}
