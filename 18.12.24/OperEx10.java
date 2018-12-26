
public class OperEx10 {

	public static void main(String[] args) {
		
//		논리연산자
//		| or연산자 , & and 연산자		
		int n = 0;
		
		n = 10;
		
		System.out.println(n % 2 == 0 || n % 3 == 0);
//		둘중 하나라도 true 면 true
		
		System.out.println(n++ % 2== 0 || n++ % 3 == 0);
//		or은 앞에게 true면 뒤에 계산식을 실행시키지 않음		
		
		n = 10;
		
		System.out.println(n % 2 == 0 && n % 3 == 0);
//		둘중 하나라도 true 가 아니면 false
		
		System.out.println(n++ % 2 == 0 && n++ % 3 == 0);
//		and는 앞에게 false면 뒤에 계산식을 실행시키지않음
		
	}
}
