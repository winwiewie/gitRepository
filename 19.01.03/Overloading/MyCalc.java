
//	오버로딩
//	메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 쉬 있어야하기 때문에
//	각기 다른 이름을 가져야한다.
//	한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것은 '메서드 오버로딩' 또는
//	간단히 '오버로딩(Overloading)'이라 한다.


//	오버로딩조건
//	1. 메서드 이름이 같아야 한다.
//	2. 매개변수의 개수 또는타입이 달라야 한다.
//	단, 반환 타입은 오버로딩을 구원하는데 아무런 영향을 주지 않는다. 

//	오버로딩의 장점
//	

public class MyCalc {

	int add(int x, int y) {
		int sum = x + y;
		
		System.out.println("int add(int x, int y) = ");
		return sum;
	}
	
	long add(long x, long y) {
		long sum = x + y;
				
		System.out.println("long add(long x, long y) = ");
		return sum;
	}
	
	long add(int[] numArr) {
		System.out.println(numArr[0]);
		
		return 4L;
	}
	
	void add() {
		System.out.println("이것도 오버로딩");
	}
	
}
