
public class CallStackTest {

	public static void main(String[] args) {

//		호출 스택의 특징
//		- 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당 받는다.
//		- 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다
//		- 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다
//		- 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
		System.out.println("main() 시작됨");
		CallStack st = new CallStack();

		
		
		st.fristMethod();
		System.out.println("main() 종료됨");
	}
}
