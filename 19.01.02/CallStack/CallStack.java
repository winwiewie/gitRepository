
public class CallStack {

	void fristMethod() {
		System.out.println("fristMethod() 시작됨");
		secondMethod();
		System.out.println("fristMethod() 종료됨");
	}
	
	void secondMethod() {
		System.out.println("secondMethod() 시작됨");
		System.out.println("System.out.println 호출 하고 종료");
		System.out.println("secondMethod() 종료됨");
	}
}
