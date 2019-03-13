package string1;

public class ExceptionEx1Test {
	public static void main(String[] args) {
		
//		100을 0~10까지의 랜덤한 수로 10번 나누는
//		프로그램을 작성하시오
//		오류가 발생하시오 처리하시오
		
		int num = 100;
		int random = 0;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			
	
			random = (int) (Math.random() * 11);
//			result = num / random; 
			
			try {
				result = num / random; 
				System.out.println((i+1) + "번재 수행 "  + num + "/" + random  + " = " + result );
			}catch(ArithmeticException e) {
//				System.out.print("오류발생 ");
				System.out.println((i+1) + "번재 수행 "  + num + "/" + random  + " = " + num );
			}
			
			
		}
	}

}
