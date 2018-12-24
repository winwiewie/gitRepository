                                                                                                                                                                    
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자동 형변환		
//		자동 형변환의 규칙
//		기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환 된다.
//		 1		 2		 4		 8		  4		  8		
//		byte -> short -> int -> long -> float -> double 
//			 	char  ->
//		묵시적 형변환 : 값의 손실이 없다.	
//		명시적 형변환 : 값의 손실이 있지만  그결과가 원하는 결과라고 compiler에게 알려준다.
//		- 큰값은 작은값으로 가는것이기때문에 형변환값을 적어 주어야 함
		
		/*
		 * 1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
		 * 2. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
		 * 	    값의 범위가 작은 타입에서 큰 타입으로 형 변환은 생략할 수 있다.
		 */
		
		double doubleNum = 0;
		float floatNum = 0;
		long longNum = 0;
		int intNum = 0;
		
		doubleNum = 20.12456789d;
		
		System.out.println(doubleNum);
		
		floatNum = (float)doubleNum;
		
		System.out.println(floatNum);
		
		floatNum = (float)38000000000.285;
		
		System.out.println("실수: " +floatNum);
		
		longNum = (long)floatNum;
		
		System.out.println("long : " + longNum);
		
		intNum = (int)longNum;
		
		System.out.println(intNum);
		
	}

}

