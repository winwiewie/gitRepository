public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		저장 가능한 값의 범위		
//		논리형 boolean : false, true
//		문자형 char : 0 ~ 65535
//
//		정수형 byte, short, int, long
//		byte : -128 ~ 127
//		short : -32,768 ~ 32,768
//		int : -2의 31승 반대까지 약 +20억
//		long : -2의36승~ 반대까지		
//		
//		실수형 float, double
//		float : 1.4e-45 ~ 3.4E38
//		double : 엄청크다(long보다 큼)
		
//		boolean
		boolean power = true;
		boolean checked = false;
		
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		
		checked = true;
		System.out.println(checked);
		System.out.println();
		
//		char
		char ch = 65;
		char text = 'A';
//		하나의 문자만을 저장할 수 있다.
	
	
		System.out.println(ch);
		System.out.println(text);
//		아스키코드표 때문에 A임
		
//		인코딩 디코딩	
//		인코딩 'A' -> 65
//		디코딩  65 -> 'A'
		
//		정수형
//		byte, short, int, long
//		1	2	4	8
//bit  	8	16	32	64		
		
		int num = -200000000;
		
		System.out.println(num);
		System.out.println();
		
		byte b = 127;
		
		b = (byte)(b+1);
		
		System.out.println(b);

//		기본값 int	
		long bigNum = 3000000000L;  // <-기본값이 int이기때문에 int 값이 넘으면 숫자 뒤에 long변수의 약자인 L을 써야함 
				
		System.out.println("long 타입: " + bigNum);
		
		int fristNum = 1500000000;
		int secondNum = 1300000000;
		
		long sum = 0;
		
		sum = fristNum;
		sum = sum + secondNum;		
//		sum = fristNum + secondNum;
		
		System.out.println("총 명품금액: "  + sum);
		
//		실수형
//		float,	double		
//		4byte,	8byte		
//		실수 정확도 -> 정밀도		
		
		float f = 9.12345678901234567890f;	//4byte 만큼의 값을 출력
		float f2 = 1.2345678901234567890f;	//4byte 값을 출력하지만 변수 f값이더커서 소수점을 더출력 
		double d = 9.12345678901234567890d;	//8byte 만큼의 값을 출력
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		
	}

}