
public class ForFlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		표현식
//		for(초기화; 조건식; 증감식) {
//			조건식이 true일때 수행할 문장들을 적는다.
//		}
//		디버깅
//		브레이크 포인트
		int sum = 0;
		
// 합산 1~10까지의 숫자를 전부 더한 값은 얼마인가요
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
			
//			0 + 0 = 0
//			0 + 1 = 1
//			1 + 2 = 3

			
			System.out.println(i + " 까지의 합 : " + sum);
		}
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("i can do it!");
//		}
		
	}

}
